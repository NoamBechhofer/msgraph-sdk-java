// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.CalendarAllowedCalendarSharingRolesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarAllowedCalendarSharingRolesCollectionRequest;
import com.microsoft.graph.requests.extensions.CalendarAllowedCalendarSharingRolesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Allowed Calendar Sharing Roles Collection Request Builder.
 */
public class CalendarAllowedCalendarSharingRolesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<CalendarRoleType, CalendarAllowedCalendarSharingRolesCollectionRequestBuilder, CalendarAllowedCalendarSharingRolesCollectionResponse, CalendarAllowedCalendarSharingRolesCollectionPage, CalendarAllowedCalendarSharingRolesCollectionRequest> {

    /**
     * The request builder for this collection of Calendar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param user the user
     */
    public CalendarAllowedCalendarSharingRolesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String user) {
        super(requestUrl, client, requestOptions, CalendarAllowedCalendarSharingRolesCollectionRequestBuilder.class, CalendarAllowedCalendarSharingRolesCollectionRequest.class);
     	 if(user!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("user", user));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CalendarAllowedCalendarSharingRolesCollectionRequest instance
     */
     @Override
    public CalendarAllowedCalendarSharingRolesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CalendarAllowedCalendarSharingRolesCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
