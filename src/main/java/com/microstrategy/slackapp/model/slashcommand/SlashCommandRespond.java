package com.microstrategy.slackapp.model.slashcommand;

import com.google.gson.annotations.SerializedName;
import com.microstrategy.slackapp.model.common.Attachments;

import java.util.List;

public class SlashCommandRespond {
    @SerializedName("response_type")
    private String responseType;
    private String text;
    private List<Attachments> attachments;



    public List<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachments> attachments) {
        this.attachments = attachments;
    }

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

   public void addAttachments(Attachments attachment){
        attachments.add(attachment);
   }
}
