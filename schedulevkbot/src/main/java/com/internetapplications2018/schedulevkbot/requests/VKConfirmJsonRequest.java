package com.internetapplications2018.schedulevkbot.requests;

public class VKConfirmJsonRequest {
    private String type;
    private String group_id;
    private String secret;

    VKConfirmJsonRequest(String type, String group_id, String secret) {
        this.type = type;
        this.group_id = group_id;
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }
}
