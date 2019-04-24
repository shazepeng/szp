package com.qf.j1808.controller;

import com.qf.j1808.pojo.Cret;
import com.qf.j1808.service.CretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CretController {
    @Autowired
    CretService cretService;

    @RequestMapping(value = "selectCret",method = RequestMethod.POST)
    public Object selectCret(){
        List<Cret> crets = cretService.selectCret();
        return crets;
    }
}
