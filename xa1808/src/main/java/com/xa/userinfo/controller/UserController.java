package com.xa.userinfo.controller;

import com.xa.pojo.UserInfo;
import com.xa.pojo.UserRole;
import com.xa.userinfo.service.UserService;
import com.xa.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "selectRoleId",method = RequestMethod.GET)
    public List<UserRole> selectRoleId(@RequestParam int id){
        return userService.selectRoleId(id);
    }

    @RequestMapping(value = "selectUserInfoByName",method = RequestMethod.POST)
    public Object selectUserByName(@RequestBody UserInfo userInfo){
        return userService.selectUserByName(userInfo);
    }

    //查询一个
    @RequestMapping(value = "getOneUserInfo")
    public UserInfo getOneUserInfo(@RequestParam int userId) {
        return userService.getOneUserInfoByid(userId);
    }

    //模糊查询
    @RequestMapping(value = "selectUserLike")
    public List<UserInfo> selectUserLike(@RequestBody UserInfo userInfo) {
        return userService.selectUserLike(userInfo);
    }

    //修改
    @RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
    public Object updateUserInfo(@RequestBody UserInfo userInfo) {
        userService.updateUserInfo(userInfo);
        return true;
    }

    //查询所有
    @RequestMapping("getAllUserInfo")
    public List<UserInfo> getAllUserInfo() {
        return userService.getAllUserInfo();
    }

    //登陆查询
    @RequestMapping(value = "selectUserInfo", method = RequestMethod.POST)
    public boolean queryUserInfo(@RequestBody UserInfo userInfo, HttpSession httpSession) {
        boolean flag = this.userService.selectUserInfo(userInfo);
        if (flag) {
            httpSession.setAttribute("user", userInfo);
        }
        return flag;
        //return userService.selectUserInfo(userInfo);
    }

    //添加用户
    @RequestMapping(value = "addUserInfo", method = RequestMethod.POST)
    public Object addUserInfo(@Valid @RequestBody UserInfoVo user, BindingResult result, ModelMap map
    ) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(user.getAccount());
        userInfo.setUserName(user.getUserName());
        userInfo.setPassword(user.getPassword());
        userInfo.setEmail(user.getEmail());
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError errors : fieldErrors) {
                System.out.println(errors.getField() + errors.getDefaultMessage());
                map.put(errors.getField(), errors.getDefaultMessage());
                return errors.getField() + ":" + errors.getDefaultMessage();
            }
        } else if (userService.checkLogin(userInfo)) {
            return "用户已存在";
        }
        userService.addUserInfo(userInfo);
        return "添加成功";
    }

    //删除用户
    @RequestMapping(value = "deleteUserInfo")
    public void deleteUserInfo(@RequestParam int userId) {
        userService.deleteUserInfoByid(userId);
    }

    //登陆
    @RequestMapping(value = "checkLogin", method = RequestMethod.POST)
    public boolean checkLogin(@RequestParam String username, String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(username);
        userInfo.setPassword(password);
        return userService.checkLogin(userInfo);
    }

    //注册
    @RequestMapping(value = "doRegist", method = RequestMethod.POST)
    public Object doRegist(@Valid @RequestBody UserInfoVo user, BindingResult result, ModelMap map
    ) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(user.getUserName());
        userInfo.setUserName(user.getUserName());
        userInfo.setPassword(user.getPassword());
        userInfo.setEmail(user.getEmail());
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError errors : fieldErrors) {
                System.out.println(errors.getField() + errors.getDefaultMessage());
                map.put(errors.getField(), errors.getDefaultMessage());
                return errors.getField() + ":" + errors.getDefaultMessage();
            }
        } else if (userService.checkLogin(userInfo)) {
            return "用户已存在";
        }
        userService.addUserInfo(userInfo);
        return "注册成功";
    }

    @RequestMapping("removeLanJie")
    public void removeLanJie(HttpSession session){session.invalidate();}
}
