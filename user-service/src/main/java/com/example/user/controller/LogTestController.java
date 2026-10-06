package com.example.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private static final Logger log =
            LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/api/test-log")
    public String testLog() {

        try {
            int result = 10 / 0;
            return String.valueOf(result);

        } catch (Exception e) {
            log.error("Test exception for JSON logging", e);
            return "Exception đã được ghi vào log";
        }
    }
}