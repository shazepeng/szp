package com.xa.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        if(uri.indexOf("queryUserInfo") > 0||uri.indexOf("login")>0||uri.indexOf("checkLogin") > 0){
            return true;
        }
        HttpSession session = httpServletRequest.getSession();
        Object userInfo = session.getAttribute("user");
            if(userInfo!=null){
                return true;
            }
            httpServletRequest.setAttribute("mess","您还没有登录，请先登录！");
            httpServletRequest.getRequestDispatcher("login.html").forward(httpServletRequest,httpServletResponse);

        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
