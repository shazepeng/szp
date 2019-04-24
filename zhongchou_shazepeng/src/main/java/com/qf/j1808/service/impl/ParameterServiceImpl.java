package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.ParameterMapper;
import com.qf.j1808.pojo.Parameter;
import com.qf.j1808.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParameterServiceImpl implements ParameterService {
    @Autowired
    ParameterMapper parameterMapper;

    public List<Parameter> selectParameter() {
        return parameterMapper.selectParameter();
    }

    public void updateParameter(Parameter parameter) {
        parameterMapper.updateParameter(parameter);
    }

    public Parameter selectOneParameter() {
        return parameterMapper.selectOneParameter();
    }
}
