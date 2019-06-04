package com.microstrategy.slackapp.model.interactive;

public class ChatResponse {
    String ok;
    String channel;
    String ts;
    String text;
    Object message;

    public ChatResponse() {}

    public ChatResponse(String ok, String channel, String ts, String text, Object message) {
        this.ok = ok;
        this.channel = channel;
        this.ts = ts;
        this.text = text;
        this.message = message;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
