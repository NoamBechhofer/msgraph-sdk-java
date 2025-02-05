// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthApplicationPerformance;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Application Performance Collection Page.
 */
public class UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthApplicationPerformance, UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthApplicationPerformance
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage(@Nonnull final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionResponse response, @Nonnull final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsAppHealthApplicationPerformance
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> pageContents, @Nullable final UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
