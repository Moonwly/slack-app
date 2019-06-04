package com.microstrategy.slackapp.model.slashcommand;

import com.google.gson.annotations.SerializedName;

public class ErrorRespond {
    @SerializedName("response_type")
    private String responseType;
    private String text;

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
