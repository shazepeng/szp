package com.qf.j1808.pojo;

public class Project_Type {
    int project_Id;
    String project_Name;
    String project_Info;

    @Override
    public String toString() {
        return "Project_Type{" +
                "project_Id=" + project_Id +
                ", project_Name='" + project_Name + '\'' +
                ", project_Info='" + project_Info + '\'' +
                '}';
    }

    public int getProject_Id() {
        return project_Id;
    }

    public void setProject_Id(int project_Id) {
        this.project_Id = project_Id;
    }

    public String getProject_Name() {
        return project_Name;
    }

    public void setProject_Name(String project_Name) {
        this.project_Name = project_Name;
    }

    public String getProject_Info() {
        return project_Info;
    }

    public void setProject_Info(String project_Info) {
        this.project_Info = project_Info;
    }
}
