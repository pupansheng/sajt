package com.pps.suanjiaotyong.config.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    //在请求处理之前进行调用（Controller方法调用之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

/*
        IndexController.logger.info("拦截----------------------------url:"+httpServletRequest.getRequestURI());

      Bloggerinfo tbUser= (Bloggerinfo) httpServletRequest.getSession().getAttribute("user");
      if(tbUser!=null){
      return  true;
      }

      httpServletResponse.sendRedirect("/login.html");*/
      return  true;
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}