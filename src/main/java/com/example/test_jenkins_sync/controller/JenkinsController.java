package com.example.test_jenkins_sync.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @PostMapping("/jenkins-notification")
    public ResponseEntity<?> handleJenkinsNotification(@RequestBody String notification) {
        System.out.println("POST: "+ notification);
        return ResponseEntity.ok().body(notification);
    }

    @GetMapping("/jenkins-notification")
    public ResponseEntity<?> handleJenkinsNotificationGet(@RequestBody String notification) {
        System.out.println("GET: "+ notification);
        return ResponseEntity.ok().body(notification);
    }
}
