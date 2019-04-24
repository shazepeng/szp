package com.qf.j1808.controller;

import com.qf.j1808.pojo.Parameter;
import com.qf.j1808.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {
    @Autowired
    ParameterService parameterService;

    @RequestMapping(value = "selectParameter")
    public Object selectParameter(){
        return parameterService.selectParameter();
    }

    @RequestMapping(value = "updateParameter")
    public Object updateParameter(@RequestBody Parameter parameter){
        parameterService.updateParameter(parameter);
        return true;
    }
}
