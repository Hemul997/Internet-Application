package com.internetapplications2018.schedulevkbot.controllers;

import com.internetapplications2018.schedulevkbot.VKConnect;
import com.internetapplications2018.schedulevkbot.requests.VKConfirmJsonRequest;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class VKConnectController {
    private VKConnect vkConnect = new VKConnect();

    @RequestMapping(value="/callback",
            method=RequestMethod.POST,
            headers = {"Content-type=application/json"})
    @ResponseBody
    public String getServerConfirm(@RequestBody VKConfirmJsonRequest request) {
        if (request.getGroup_id().equals(vkConnect.getGroupID())
                && (request.getType().equals("confirmation"))
                && (request.getSecret().equals(vkConnect.getSecretGroupKey()))) {
            return "b8dce03d";
        }
        return ":(";
    }

    //UserAuthResponse authResponse = vk.oauth().userAuthorizationCodeFlow()

}
