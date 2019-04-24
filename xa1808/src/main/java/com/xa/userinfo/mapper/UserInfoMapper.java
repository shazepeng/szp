package com.xa.userinfo.mapper;

import com.xa.pojo.UserInfo;
import com.xa.pojo.UserRole;

import java.util.List;

public interface UserInfoMapper {
    public UserInfo selectLogin(String username);

    public List<UserInfo> getAllUserInfo();

    public UserInfo selectUserByName(UserInfo userInfo);

    public List<UserRole> selectRoleId(int id);

    public void addUserInfo(UserInfo userInfo);

    public UserInfo getOneUserInfoByid(int id);

    public void updateUserInfo(UserInfo userInfo);

    public void deleteUserInfoByid(int id);

    public List<UserInfo> selectUserInfo(UserInfo userInfo);

    public List<UserInfo> selectUserLike(UserInfo userInfo);

}
