package com.lxq.subject.application.controller;

import com.lxq.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 娄须强
 * @CreateTime: 2023-11-20  23:48
 */
@RestController
public class SubjectController {

    @Resource
    private SubjectCategoryService service;

    @GetMapping("/test")
    public String test() {
        return service.queryById(1L).getCategoryName();
    }
}
