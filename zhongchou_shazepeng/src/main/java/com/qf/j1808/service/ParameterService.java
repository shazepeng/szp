package com.qf.j1808.service;

import com.qf.j1808.pojo.Parameter;

import java.util.List;

public interface ParameterService {

    public List<Parameter> selectParameter();

    public void updateParameter(Parameter parameter);

    public Parameter selectOneParameter();

}
