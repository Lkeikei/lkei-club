package com.lxq.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 娄须强
 * @CreateTime: 2023-11-20  23:48
 */
@RestController
public class SubjectController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
