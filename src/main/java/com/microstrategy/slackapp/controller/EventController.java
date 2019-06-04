package com.microstrategy.slackapp.controller;

import com.google.gson.JsonObject;
import com.microstrategy.slackapp.consts.Consts;
import com.microstrategy.slackapp.model.event.Event;
import com.microstrategy.slackapp.utils.HttpUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EventController {
    @PostMapping("/event")
    public String challenge(@RequestBody Event event) {
        if (event.getToken() != null && event.getToken().equals(Consts.VERIFICATION_TOKEN)) {
            String urlPath = "https://slack.com/api/chat.postMessage";
            Map<String, String> params = new HashMap<>();
            if (event.getChallenge() != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("challenge", event.getChallenge());
                return jsonObject.toString();
            }
            params.put("token", Consts.OAUTH_ACCESS_TOKEN_WLY);
            params.put("channel", event.getEvent().getChannel());
            params.put("text", "this is a microstrategy link");
            String result = HttpUtils.doPost(urlPath, params);

            System.out.println(result);
        }
        return "";

    }
}
