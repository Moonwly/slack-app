package com.microstrategy.slackapp.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.microstrategy.slackapp.consts.Consts;
import com.microstrategy.slackapp.model.common.Attachments;
import com.microstrategy.slackapp.model.event.Event;
import com.microstrategy.slackapp.model.interactive.Action;
import com.microstrategy.slackapp.utils.HttpUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EventController {
    @PostMapping("/event")
    public String challenge(@RequestBody Event event) {
        Gson gson = new Gson();
        if (event.getToken() != null && event.getToken().equals(Consts.VERIFICATION_TOKEN)) {
            String urlPath = "https://slack.com/api/chat.postEphemeral";
            Map<String, String> params = new HashMap<>();
            if (event.getChallenge() != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("challenge", event.getChallenge());
                return jsonObject.toString();
            }
            List<String> users = event.getAuthed_users();
            params.put("token", Consts.OAUTH_ACCESS_TOKEN_WLY);
            params.put("channel", event.getEvent().getChannel());
            params.put("text", "That looks like a Microstrategy link.");
            List<Attachments> attachments = new ArrayList<>();
            Attachments attachment = new Attachments();
            attachment.setFallback("Would you like to bind your Slack account with your MSTR Library account?");
            attachment.setTitle("Would you like to bind your Slack account with your MSTR Library account?");
            List<Action> actions = new ArrayList<>();
            Action action1 = new Action("yes", "button", "yes", "Yes");
            Action action2 = new Action("not now", "button", "not now", "Not now");
            Action action3 = new Action("never", "button", "never", "Never");
            actions.add(action1);
            actions.add(action2);
            actions.add(action3);
            attachment.setCallbackId("comic_1234_xyz");
            attachment.setColor("#3AA3E3");
            attachment.setActions(actions);
            attachments.add(attachment);
            params.put("attachments", gson.toJson(attachments));
            for (String user : users) {
                params.put("user", user);
                String result = HttpUtils.doPost(urlPath, params);
                System.out.println(result);
            }

        }
        return "";

    }
}
