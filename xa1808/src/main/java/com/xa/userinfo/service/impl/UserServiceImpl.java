package com.xa.userinfo.service.impl;

import com.xa.pojo.UserInfo;
import com.xa.pojo.UserRole;
import com.xa.userinfo.service.UserService;
import com.xa.userinfo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired(required = false)
    UserInfoMapper userInfoDao;


    public UserInfo selectLogin(String username) {
        return userInfoDao.selectLogin(username);
    }

    @Transactional
    public List<UserInfo> getAllUserInfo() {
        return userInfoDao.getAllUserInfo();
    }

    public UserInfo selectUserByName(UserInfo userInfo) {
        return userInfoDao.selectUserByName(userInfo);
    }

    public List<UserRole> selectRoleId(int id) {
        return userInfoDao.selectRoleId(id);
    }

    @Transactional
    public void addUserInfo(UserInfo userInfo) {
        this.userInfoDao.addUserInfo(userInfo);
    }

    @Transactional
    public void deleteUserInfoByid(int id) {
        this.userInfoDao.deleteUserInfoByid(id);
    }

    @Transactional
    public UserInfo getOneUserInfoByid(int id) {
        return userInfoDao.getOneUserInfoByid(id);
    }

    @Transactional
    public void updateUserInfo(UserInfo userInfo) {
        this.userInfoDao.updateUserInfo(userInfo);
    }

    @Transactional
    public boolean selectUserInfo(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoDao.selectUserInfo(userInfo);
        if(userInfos!=null&userInfos.size()>0){
            return true;
        }
        return false;
    }

    @Transactional
    public boolean checkLogin(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoDao.selectUserInfo(userInfo);
        if(userInfos!=null&userInfos.size()>0){
            return true;
        }
        return false;
    }

    public List<UserInfo> selectUserLike(UserInfo userInfo) {
        return userInfoDao.selectUserLike(userInfo);
    }


}