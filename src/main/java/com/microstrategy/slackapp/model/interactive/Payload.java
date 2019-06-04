package com.microstrategy.slackapp.model.interactive;

import com.google.gson.annotations.SerializedName;
import com.microstrategy.slackapp.model.event.Message;
import com.microstrategy.slackapp.model.interactive.Action;
import com.microstrategy.slackapp.model.common.Channel;

import java.util.List;

public class Payload {
    String type;
    Object team;
    Object user;
    @SerializedName("api_app_id")
    String apiAppId;
    String token;
    Object container;
    @SerializedName("trigger_id")
    String triggerId;
    Channel channel;
    @SerializedName("original_message")
    Message originalMessage;
    @SerializedName("response_url")
    String responseUrl;
    List<Action> actions;

    public Payload() {}

    public Payload(String type, Object team, Object user, String apiAppId, String token, Object container, String triggerId, Channel channel, Message originalMessage, String responseUrl, List<Action> actions) {
        this.type = type;
        this.team = team;
        this.user = user;
        this.apiAppId = apiAppId;
        this.token = token;
        this.container = container;
        this.triggerId = triggerId;
        this.channel = channel;
        this.originalMessage = originalMessage;
        this.responseUrl = responseUrl;
        this.actions = actions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getTeam() {
        return team;
    }

    public void setTeam(Object team) {
        this.team = team;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getApiAppId() {
        return apiAppId;
    }

    public void setApiAppId(String apiAppId) {
        this.apiAppId = apiAppId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getContainer() {
        return container;
    }

    public void setContainer(Object container) {
        this.container = container;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Message getOriginalMessage() {
        return originalMessage;
    }

    public void setOriginalMessage(Message originalMessage) {
        this.originalMessage = originalMessage;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
