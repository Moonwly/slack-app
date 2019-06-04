package com.microstrategy.slackapp.model.slashcommand;

import com.google.gson.annotations.SerializedName;

public class RequestPayload {
    private String token;
    @SerializedName("team_id")
    private String teamId;
    @SerializedName("team_domain")
    private String teamDomain;
    @SerializedName("enterprise_id")
    private String enterpriseId;
    @SerializedName("enterprise_name")
    private String getEnterpriseName;
    @SerializedName("channel_id")
    private String channelId;
    @SerializedName("channel_name")
    private String channelName;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("user_name")
    private String userName;
    private String command;
    private String text;
    @SerializedName("response_url")
    private String responseUrl;
    @SerializedName("trigger_id")
    private String triggerId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamDomain() {
        return teamDomain;
    }

    public void setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getGetEnterpriseName() {
        return getEnterpriseName;
    }

    public void setGetEnterpriseName(String getEnterpriseName) {
        this.getEnterpriseName = getEnterpriseName;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }
}
