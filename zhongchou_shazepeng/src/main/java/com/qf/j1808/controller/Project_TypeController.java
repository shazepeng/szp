package com.qf.j1808.controller;

import com.qf.j1808.pojo.Project_Type;
import com.qf.j1808.service.Project_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Project_TypeController {
    @Autowired
    Project_TypeService project_typeService;

    @RequestMapping("selectProject_Type")
    public List<Project_Type> selectProject_Type(){
        return project_typeService.selectProject_Type();
    }
}
