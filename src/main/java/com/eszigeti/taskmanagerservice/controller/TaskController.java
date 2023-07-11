package com.eszigeti.taskmanagerservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TaskController {

    @GetMapping
    String dummyEndpoint() {
        log.info("Dummy endpoint");
        return "OK";
    }
}
