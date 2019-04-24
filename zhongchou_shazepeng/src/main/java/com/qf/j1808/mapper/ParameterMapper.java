package com.qf.j1808.mapper;

import com.qf.j1808.pojo.Parameter;

import java.util.List;

public interface ParameterMapper {

    public List<Parameter> selectParameter();

    public void updateParameter(Parameter parameter);

    public Parameter selectOneParameter();
}
