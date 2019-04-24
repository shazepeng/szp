package com.xa.userinfo.service;

import com.xa.pojo.UserInfo;
import com.xa.pojo.UserRole;

import java.util.List;

public interface UserService {
    public UserInfo selectLogin(String username);

    public List<UserInfo> getAllUserInfo();

    public UserInfo selectUserByName(UserInfo userInfo);

    public List<UserRole> selectRoleId(int id);

    public void addUserInfo(UserInfo userInfo);

    public void deleteUserInfoByid(int id);

    public UserInfo getOneUserInfoByid(int id);

    public void updateUserInfo(UserInfo userInfo);

    public boolean selectUserInfo(UserInfo userInfo);

    public boolean checkLogin(UserInfo userInfo);

    public List<UserInfo> selectUserLike(UserInfo userInfo);
}
