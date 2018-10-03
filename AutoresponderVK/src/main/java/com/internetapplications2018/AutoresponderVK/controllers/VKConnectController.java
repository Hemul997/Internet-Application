package com.internetapplications2018.AutoresponderVK.controllers;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VKConnectController {
    private TransportClient transportClient = new HttpTransportClient();
    VkApiClient vk = new VkApiClient(transportClient);

    @GetMapping("/vk")
    public String getCode() {
        return "";
    }
    //UserAuthResponse authResponse = vk.oauth().userAuthorizationCodeFlow()

}
