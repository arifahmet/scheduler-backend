package com.barbaktech.schedulerbackend.controller.v1;

import com.barbaktech.schedulerbackend.model.SchedulerTasks;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin(origins = {"http://localhost:3000", "https://scheduler-frontend-phi.vercel.app"})
@RequestMapping(value = "/api/v1/schedule-management")
public class ScheduleManagementController {


    @GetMapping
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    public ResponseEntity<List<SchedulerTasks>> getTasks() {
        return ResponseEntity.ok(createDummyList());
    }

    private List<SchedulerTasks> createDummyList() {
        List<SchedulerTasks> tasks = new ArrayList<>();
        tasks.add(SchedulerTasks.builder()
                .name("test1").build());
        tasks.add(SchedulerTasks.builder()
                .name("test2").build());
        tasks.add(SchedulerTasks.builder()
                .name("test3").build());
        tasks.add(SchedulerTasks.builder()
                .name("test4").build());
        return tasks;
    }
}
