package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import com.microsoft.graph.content.MSBatchRequestContent;
import com.microsoft.graph.content.MSBatchResponseContent;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.requests.GraphServiceClient;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.UserRequest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Disabled
public class BatchTests {
    @Test
    public void GetsABatchFromRequests() throws IOException{
        final TestBase testBase = new TestBase();
		final GraphServiceClient graphServiceClient = testBase.graphClient;
        final MSBatchRequestContent batchContent = new MSBatchRequestContent();
        final String meGetId = batchContent.addBatchRequestStep(graphServiceClient.me()
                                        .buildRequest()
                                        .withHttpMethod(HttpMethod.GET)
                                        .getHttpRequest());
        assertNotNull(meGetId);
        final String usersGetId = batchContent.addBatchRequestStep(graphServiceClient.users()
                        .buildRequest()
                        .filter("accountEnabled eq true")
                        .expand("manager")
                        .top(5)
                        .withHttpMethod(HttpMethod.GET)
                        .getHttpRequest(),
                        meGetId);
        final User userToAdd = new User();
        userToAdd.givenName = "Darrel";
        final String userPostId = batchContent.addBatchRequestStep(graphServiceClient.users()
                        .buildRequest()
                        .withHttpMethod(HttpMethod.POST)
                        .getHttpRequest(userToAdd), usersGetId);

        final String serializedBatchContent = batchContent.getBatchRequestContent();

        final Request batchRequest = new Request.Builder()
                        .url("https://graph.microsoft.com/v1.0/$batch")
                        .post(RequestBody.create(serializedBatchContent, MediaType.parse("application/json")))
                        .build();

        final OkHttpClient client = HttpClients.createDefault(testBase.getAuthenticationProvider());
        try (final Response batchResponse = client.newCall(batchRequest).execute()) {
            assertEquals(200, batchResponse.code());

            final MSBatchResponseContent responseContent = new MSBatchResponseContent(batchResponse);
            assertEquals(400, responseContent.getResponseById(userPostId).code()); //400:we're not providing enough properties for the call to go through
            assertEquals(200, responseContent.getResponseById(meGetId).code());
            assertEquals(200, responseContent.getResponseById(usersGetId).code());
        }
    }
}
