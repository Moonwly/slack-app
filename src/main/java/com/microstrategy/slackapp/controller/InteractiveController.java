package com.microstrategy.slackapp.controller;

import com.google.gson.Gson;
import com.microstrategy.slackapp.model.interactive.Action;
import com.microstrategy.slackapp.model.interactive.ChatResponse;
import com.microstrategy.slackapp.model.interactive.Payload;
import com.microstrategy.slackapp.utils.HttpUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class InteractiveController {

    @PostMapping("/payload")
    @ResponseBody
    public void getPayload(@RequestParam Map<String, String> params) {
        Gson gson = new Gson();
        String payloadString = params.get("payload");
        Payload payload = gson.fromJson(payloadString, Payload.class);
        List<Action> action = payload.getActions();
        String verificationToken = payload.getToken();
        String channelID = payload.getChannel().getId();
        String actionValue = action.get(0).getValue();
        String ts = payload.getOriginalMessage().getTs();

        if (verificationToken.equals(Consts.VERIFICATION_TOKEN)) {
            Map<String, String> map = new HashMap<>();
            map.put("token", Consts.OAUTH_ACCESS_TOKEN_WLY);
            map.put("channel", channelID);
            map.put("text", actionValue);
            map.put("ts", ts);
            map.put("attachments", "[]");
            String result = HttpUtils.doPost("https://slack.com/api/chat.update", map);
            ChatResponse response = gson.fromJson(result, ChatResponse.class);
            if (response.getOk().equals("true")) {
                System.out.println("succeed");
            }
            else {
                System.out.println("failed");
            }
        }
    }
}