package com.qf.j1808.controller;

import com.qf.j1808.pojo.UserInfo;
import com.qf.j1808.pojo.UserRole;
import com.qf.j1808.service.UserService;
import com.qf.j1808.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
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

    //查询所有用户
    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public Object selectAll(){
        List<UserInfo> userInfos = userService.selectAll();
        return userInfos;
    }

    //注册
    @RequestMapping(value = "doRegist", method = RequestMethod.POST)
    public Object doRegist(@Valid @RequestBody UserInfoVo user, BindingResult result, ModelMap map
    ) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(user.getAccount());
        userInfo.setUserName(user.getUserName());
        userInfo.setPassword(user.getPassword());
        userInfo.setEmail(user.getEmail());
        userInfo.setGrade(user.getGrade());
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
    //根据登陆名查询
    @RequestMapping(value = "selectLogin")
    public Object selectLogin(@RequestParam String account){
        return userService.selectAccount(account);
    }
    //查询用户的角色id
    @RequestMapping(value = "selectRoleId",method = RequestMethod.GET)
    public List<UserRole> selectRoleId(@RequestParam int id){
        return userService.selectRoleId(id);
    }
    //登陆
    @RequestMapping(value = "checkLogin", method = RequestMethod.POST)
    public Object checkLogin(@RequestParam String account, String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(password);
        return userService.checkLogin(userInfo);
    }
    //查询一个
    @RequestMapping(value = "getOneUserInfo")
    public UserInfo getOneUserInfo(@RequestParam int userId) {
        return userService.getOneUserInfo(userId);
    }
    //修改
    @RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
    public Object updateUserInfo(@RequestBody UserInfo userInfo) {
        userService.updateUserInfo(userInfo);
        return true;
    }

    @RequestMapping(value = "selectUserLike")
    public List<UserInfo> selectUserLike(@RequestBody UserInfo userInfo) {
        return userService.selectUserLike(userInfo);
    }
}
