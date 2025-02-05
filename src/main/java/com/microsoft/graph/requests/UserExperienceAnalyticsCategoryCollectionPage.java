// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsCategory;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Category Collection Page.
 */
public class UserExperienceAnalyticsCategoryCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsCategory, UserExperienceAnalyticsCategoryCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsCategory
     *
     * @param response the serialized UserExperienceAnalyticsCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsCategoryCollectionPage(@Nonnull final UserExperienceAnalyticsCategoryCollectionResponse response, @Nonnull final UserExperienceAnalyticsCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsCategoryCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsCategory> pageContents, @Nullable final UserExperienceAnalyticsCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
