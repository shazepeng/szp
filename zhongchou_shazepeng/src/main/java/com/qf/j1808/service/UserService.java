package com.qf.j1808.service;

import com.qf.j1808.pojo.UserInfo;
import com.qf.j1808.pojo.UserRole;

import java.util.List;

public interface UserService {
    public boolean selectUserInfo(UserInfo userInfo);

    public boolean checkLogin(UserInfo userInfo);

    public UserInfo selectLogin(UserInfo userInfo);

    public List<UserInfo> selectAll();

    public void addUserInfo(UserInfo userInfo);

    public UserInfo selectAccount(String account);

    public UserInfo getOneUserInfo(int id);

    public void updateUserInfo(UserInfo userInfo);

    public List<UserRole> selectRoleId(int id);

    public List<UserInfo> selectUserLike(UserInfo userInfo);
}
