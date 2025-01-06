package com.prabhsagar.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/oauth")
public class OauthController {

    @GetMapping("/get/user")
    public String testUser() {
        return "this is the test";
    }
}
