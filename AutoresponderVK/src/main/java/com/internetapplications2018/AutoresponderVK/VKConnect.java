package com.internetapplications2018.AutoresponderVK;

import org.springframework.web.client.RestTemplate;

public class VKConnect {
    private String appID = "6705164";
    private String secretKey = "O2f9zXoQocWfMKj88c6P";
    private String version = "5.85";

    public void connect() {
        RestTemplate restTemplate = new RestTemplate();

    }

    public String getAppID() {
        return appID;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getVersion() {
        return version;
    }
}
