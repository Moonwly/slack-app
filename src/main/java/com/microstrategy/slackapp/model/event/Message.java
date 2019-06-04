package com.microstrategy.slackapp.model.event;

public class Message {
    String type;
    String subtype;
    String text;
    String ts;
    String username;

    public Message() {}

    public Message(String type, String subtype, String text, String ts, String username) {
        this.type = type;
        this.subtype = subtype;
        this.text = text;
        this.ts = ts;
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
