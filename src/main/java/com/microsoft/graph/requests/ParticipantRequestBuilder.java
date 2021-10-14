// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Participant;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.InviteParticipantsOperation;
import com.microsoft.graph.models.MuteParticipantOperation;
import com.microsoft.graph.models.Prompt;
import com.microsoft.graph.models.StartHoldMusicOperation;
import com.microsoft.graph.models.StopHoldMusicOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ParticipantMuteParameterSet;
import com.microsoft.graph.models.ParticipantStartHoldMusicParameterSet;
import com.microsoft.graph.models.ParticipantStopHoldMusicParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Request Builder.
 */
public class ParticipantRequestBuilder extends BaseRequestBuilder<Participant> {

    /**
     * The request builder for the Participant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ParticipantRequest instance
     */
    @Nonnull
    public ParticipantRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ParticipantRequest instance
     */
    @Nonnull
    public ParticipantRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ParticipantRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ParticipantMuteRequestBuilder mute(@Nonnull final ParticipantMuteParameterSet parameters) {
        return new ParticipantMuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ParticipantStartHoldMusicRequestBuilder startHoldMusic(@Nonnull final ParticipantStartHoldMusicParameterSet parameters) {
        return new ParticipantStartHoldMusicRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.startHoldMusic"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ParticipantStopHoldMusicRequestBuilder stopHoldMusic(@Nonnull final ParticipantStopHoldMusicParameterSet parameters) {
        return new ParticipantStopHoldMusicRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stopHoldMusic"), getClient(), null, parameters);
    }
}
