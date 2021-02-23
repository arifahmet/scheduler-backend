package com.barbaktech.schedulerbackend.controller.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1/schedule-management")
public class ScheduleManagementController {


    @GetMapping
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}
