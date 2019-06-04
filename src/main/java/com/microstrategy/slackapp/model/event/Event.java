package com.microstrategy.slackapp.model.event;

import java.util.List;

public class Event {
    private String token;
    private String team_id;
    private String api_app_id;
    private SharedLinkType event;
    private String type;
    private List<String> authed_users;
    private String event_id;
    private Integer event_time;
    private String challenge;

    public Event(String token, String team_id, String api_app_id, SharedLinkType event, String type, List<String> authed_users, String event_id, Integer event_time) {
        this.token = token;
        this.team_id = team_id;
        this.api_app_id = api_app_id;
        this.event = event;
        this.type = type;
        this.authed_users = authed_users;
        this.event_id = event_id;
        this.event_time = event_time;
    }

    public Event(String token, String type, String challenge) {
        this.token = token;
        this.type = type;
        this.challenge = challenge;
    }

    public Event() {}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getApi_app_id() {
        return api_app_id;
    }

    public void setApi_app_id(String api_app_id) {
        this.api_app_id = api_app_id;
    }

    public SharedLinkType getEvent() {
        return event;
    }

    public void setEvent(SharedLinkType event) {
        this.event = event;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAuthed_users() {
        return authed_users;
    }

    public void setAuthed_users(List<String> authed_users) {
        this.authed_users = authed_users;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public Integer getEvent_time() {
        return event_time;
    }

    public void setEvent_time(Integer event_time) {
        this.event_time = event_time;
    }

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }
}
