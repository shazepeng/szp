package com.qf.j1808.pojo;

public class Parameter {
    int parameterId;
    String parameterName;
    String parameterCode;
    int parameterValue;

    @Override
    public String toString() {
        return "Parameter{" +
                "parameterId=" + parameterId +
                ", parameterName='" + parameterName + '\'' +
                ", parameterCode='" + parameterCode + '\'' +
                ", parameterValue=" + parameterValue +
                '}';
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterCode() {
        return parameterCode;
    }

    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }

    public int getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(int parameterValue) {
        this.parameterValue = parameterValue;
    }
}
