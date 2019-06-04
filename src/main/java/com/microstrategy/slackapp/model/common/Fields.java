package com.microstrategy.slackapp.model.common;

import com.google.gson.annotations.SerializedName;

public class Fields {
    private String title;
    private String value;
    @SerializedName("short")
    private boolean shorts;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isShorts() {
        return shorts;
    }

    public void setShorts(boolean shorts) {
        this.shorts = shorts;
    }
}
