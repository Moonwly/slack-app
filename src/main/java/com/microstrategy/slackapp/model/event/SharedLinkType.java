package com.microstrategy.slackapp.model.event;

import java.util.List;

public class SharedLinkType {
    String type;
    String channel;
    String user;
    String message_ts;
    String thread_ts;
    List<Link> links;

    public SharedLinkType(String type, String channel, String user, String message_ts, String thread_ts, List<Link> links) {
        this.type = type;
        this.channel = channel;
        this.user = user;
        this.message_ts = message_ts;
        this.thread_ts = thread_ts;
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage_ts() {
        return message_ts;
    }

    public void setMessage_ts(String message_ts) {
        this.message_ts = message_ts;
    }

    public String getThread_ts() {
        return thread_ts;
    }

    public void setThread_ts(String thread_ts) {
        this.thread_ts = thread_ts;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
