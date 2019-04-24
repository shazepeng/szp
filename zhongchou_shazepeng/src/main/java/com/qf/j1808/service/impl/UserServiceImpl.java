package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.UserMapper;
import com.qf.j1808.pojo.UserInfo;
import com.qf.j1808.pojo.UserRole;
import com.qf.j1808.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional
    public boolean selectUserInfo(UserInfo userInfo) {
        List<UserInfo> userInfos = userMapper.selectUserInfo(userInfo);
        if(userInfos!=null&&userInfos.size()>0){
            return true;
        }
        return false;
    }
    @Transactional
    public boolean checkLogin(UserInfo userInfo) {
        List<UserInfo> userInfos = userMapper.selectUserInfo(userInfo);
        if(userInfo!=null&&userInfos.size()>0){
            return true;
        }
        return false;
    }

    public UserInfo selectLogin(UserInfo userInfo) {
        return userMapper.selectLogin(userInfo);
    }

    public List<UserInfo> selectAll() {
        return userMapper.selectAll();
    }


    public void addUserInfo(UserInfo userInfo) {
        this.userMapper.addUserInfo(userInfo);
    }

    public UserInfo selectAccount(String account) {
        return userMapper.selectAccount(account);
    }

    public UserInfo getOneUserInfo(int id) {
        return userMapper.getOneUserInfo(id);
    }

    public void updateUserInfo(UserInfo userInfo) {
        userMapper.updateUserInfo(userInfo);
    }

    public List<UserRole> selectRoleId(int id) {
        return userMapper.selectRoleId(id);
    }

    public List<UserInfo> selectUserLike(UserInfo userInfo) {
        return userMapper.selectUserLike(userInfo);
    }

}
