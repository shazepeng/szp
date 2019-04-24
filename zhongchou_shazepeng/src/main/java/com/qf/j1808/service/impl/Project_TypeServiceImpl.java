package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.Project_TypeMapper;
import com.qf.j1808.pojo.Project_Type;
import com.qf.j1808.service.Project_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Project_TypeServiceImpl implements Project_TypeService {
    @Autowired
    Project_TypeMapper project_typeMapper;

    public List<Project_Type> selectProject_Type() {
        return project_typeMapper.selectProject_Type();
    }
}
