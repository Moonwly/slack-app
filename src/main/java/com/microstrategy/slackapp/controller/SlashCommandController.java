package com.microstrategy.slackapp.controller;

import com.google.gson.Gson;
import com.microstrategy.slackapp.model.common.Attachments;
import com.microstrategy.slackapp.model.interactive.Action;
import com.microstrategy.slackapp.model.slashcommand.SlashCommandRespond;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class SlashCommandController {


    @RequestMapping(value = "/getdossier", method = RequestMethod.POST)
    @ResponseBody
    public String getDossier(@RequestParam Map<String,String> params) {
        Gson gson = new Gson();
        SlashCommandRespond res = new SlashCommandRespond();
        List<Attachments> attachmentList = new ArrayList<>();
        String response = "";
        if (params.get("token").equals(Consts.VERIFICATION_TOKEN)) {
            if(params.get("text").equals("list")){
                res.setResponseType("ephemeral");
                res.setText("Here is your dossier collection");
                Attachments attachments1 = new Attachments();
                List<Action> actions = new ArrayList<>();
                Action action = new Action("detail","button","detail","detail");
                actions.add(action);
                attachments1.setActions(actions);
                attachments1.setCallbackId("abc_123");
                attachments1.setText("This report is about our trend in error rate.");
                attachments1.setColor("#2012e5");
                attachments1.setTitle("Quality Analysis: Trend in Error Rate");
                attachments1.setTitleLink("https://aqueduct-tech.customer.cloud.microstrategy.com/MicroStrategyLibrary/" +
                        "app/9323A4BC11E798C58D3A0080EF85790A/C9920D4311E820BD5AE70080EF8538F0" +
                        "/W266E3DD328C14B84B4B9B97F53E55405--KE1DDF97911E7829ECEF60080EF2559CF");
                attachments1.setThumbUrl("https://wx3.sinaimg.cn/mw690/6a7f2b9agy1g3h261zduqj21hc0oh758.jpg");
                Attachments attachments2 = new Attachments();
                attachments2.setActions(actions);
                attachments2.setCallbackId("abc_123");
                attachments2.setText("Our new defects analysis is updated, please check it out!");
                attachments2.setColor("#2012e5");
                attachments2.setTitle("Defects Dossier");
                attachments2.setTitleLink("https://aqueduct-tech.customer.cloud.microstrategy.com/MicroStrategyLibrary/app/" +
                        "0730F68F4B8B4B52AA23F0AAB46F3CA8/546B16A211E836A358CC0080EF95CBE5");
                attachments2.setThumbUrl("https://wx4.sinaimg.cn/mw690/6a7f2b9agy1g3h2jhozeoj21hc0pggmi.jpg");
                Attachments attachments3 = new Attachments();
                attachments3.setActions(actions);
                attachments3.setCallbackId("abc_123");
                attachments3.setText("Last week we have analyzed the cube and made a dossier");
                attachments3.setColor("#2012e5");
                attachments3.setTitle("Cube Analysis: Cube Analysis");
                attachments3.setTitleLink("https://aqueduct-tech.customer.cloud.microstrategy.com/MicroStrategyLibrary/app" +
                        "/9323A4BC11E798C58D3A0080EF85790A/B444661C11E77B98D0170080EF459614/K00D0512511E7CAE20E250080EF6571C8--K00D03E2911E7CAE2032E0080EF6571C8");
                attachments3.setThumbUrl("https://wx1.sinaimg.cn/mw690/6a7f2b9agy1g3h2l1yqqcj21hc0pngma.jpg");
                attachmentList.add(attachments1);
                attachmentList.add(attachments2);
                attachmentList.add(attachments3);
                res.setAttachments(attachmentList);
                response = gson.toJson(res);
                return response;
            }
            return response;
        } else {
            res.setResponseType("ephemeral");
            res.setText("Sorry, this function has something wrong");
            response = gson.toJson(res);
            return response;

        }
    }

}
