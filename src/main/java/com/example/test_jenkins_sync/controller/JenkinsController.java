package com.example.test_jenkins_sync.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @PostMapping("/jenkins-notification")
    public void handleJenkinsNotification(@RequestBody String notification) {
        System.out.println(notification);
    }
}
