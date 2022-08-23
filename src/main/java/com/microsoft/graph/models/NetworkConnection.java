// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ConnectionDirection;
import com.microsoft.graph.models.SecurityNetworkProtocol;
import com.microsoft.graph.models.ConnectionStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network Connection.
 */
public class NetworkConnection implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Name.
     * Name of the application managing the network connection (for example, Facebook or SMTP).
     */
    @SerializedName(value = "applicationName", alternate = {"ApplicationName"})
    @Expose
	@Nullable
    public String applicationName;

    /**
     * The Destination Address.
     * Destination IP address (of the network connection).
     */
    @SerializedName(value = "destinationAddress", alternate = {"DestinationAddress"})
    @Expose
	@Nullable
    public String destinationAddress;

    /**
     * The Destination Domain.
     * Destination domain portion of the destination URL. (for example 'www.contoso.com').
     */
    @SerializedName(value = "destinationDomain", alternate = {"DestinationDomain"})
    @Expose
	@Nullable
    public String destinationDomain;

    /**
     * The Destination Location.
     * Location (by IP address mapping) associated with the destination of a network connection.
     */
    @SerializedName(value = "destinationLocation", alternate = {"DestinationLocation"})
    @Expose
	@Nullable
    public String destinationLocation;

    /**
     * The Destination Port.
     * Destination port (of the network connection).
     */
    @SerializedName(value = "destinationPort", alternate = {"DestinationPort"})
    @Expose
	@Nullable
    public String destinationPort;

    /**
     * The Destination Url.
     * Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     */
    @SerializedName(value = "destinationUrl", alternate = {"DestinationUrl"})
    @Expose
	@Nullable
    public String destinationUrl;

    /**
     * The Direction.
     * Network connection direction. Possible values are: unknown, inbound, outbound.
     */
    @SerializedName(value = "direction", alternate = {"Direction"})
    @Expose
	@Nullable
    public ConnectionDirection direction;

    /**
     * The Domain Registered Date Time.
     * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "domainRegisteredDateTime", alternate = {"DomainRegisteredDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime domainRegisteredDateTime;

    /**
     * The Local Dns Name.
     * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     */
    @SerializedName(value = "localDnsName", alternate = {"LocalDnsName"})
    @Expose
	@Nullable
    public String localDnsName;

    /**
     * The Nat Destination Address.
     * Network Address Translation destination IP address.
     */
    @SerializedName(value = "natDestinationAddress", alternate = {"NatDestinationAddress"})
    @Expose
	@Nullable
    public String natDestinationAddress;

    /**
     * The Nat Destination Port.
     * Network Address Translation destination port.
     */
    @SerializedName(value = "natDestinationPort", alternate = {"NatDestinationPort"})
    @Expose
	@Nullable
    public String natDestinationPort;

    /**
     * The Nat Source Address.
     * Network Address Translation source IP address.
     */
    @SerializedName(value = "natSourceAddress", alternate = {"NatSourceAddress"})
    @Expose
	@Nullable
    public String natSourceAddress;

    /**
     * The Nat Source Port.
     * Network Address Translation source port.
     */
    @SerializedName(value = "natSourcePort", alternate = {"NatSourcePort"})
    @Expose
	@Nullable
    public String natSourcePort;

    /**
     * The Protocol.
     * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     */
    @SerializedName(value = "protocol", alternate = {"Protocol"})
    @Expose
	@Nullable
    public SecurityNetworkProtocol protocol;

    /**
     * The Risk Score.
     * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
	@Nullable
    public String riskScore;

    /**
     * The Source Address.
     * Source (i.e. origin) IP address (of the network connection).
     */
    @SerializedName(value = "sourceAddress", alternate = {"SourceAddress"})
    @Expose
	@Nullable
    public String sourceAddress;

    /**
     * The Source Location.
     * Location (by IP address mapping) associated with the source of a network connection.
     */
    @SerializedName(value = "sourceLocation", alternate = {"SourceLocation"})
    @Expose
	@Nullable
    public String sourceLocation;

    /**
     * The Source Port.
     * Source (i.e. origin) IP port (of the network connection).
     */
    @SerializedName(value = "sourcePort", alternate = {"SourcePort"})
    @Expose
	@Nullable
    public String sourcePort;

    /**
     * The Status.
     * Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public ConnectionStatus status;

    /**
     * The Url Parameters.
     * Parameters (suffix) of the destination URL.
     */
    @SerializedName(value = "urlParameters", alternate = {"UrlParameters"})
    @Expose
	@Nullable
    public String urlParameters;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
