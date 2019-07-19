package com.pps.suanjiaotyong.controller;



import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.pojo.group.MessageType;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.service.DriverService;
import com.pps.suanjiaotyong.service.UserService;
import com.pps.suanjiaotyong.util.IdWorker;
import com.pps.suanjiaotyong.util.MessageUtil;
import com.pps.suanjiaotyong.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Classname UserController
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/16 11:40
 * @Vestion 1.0
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    MessageUtil messageUtil;
    @Autowired
    DriverService driverService;

    //获得手机验证码
    @RequestMapping("/getYanzhengma")
    public Result getYanzhengma(String phone, HttpServletRequest httpServletRequest,String type){


        String yanzhengma = String.valueOf(UUIDUtil.getNumber(5));

        boolean f=false;
        if (type.equals("register"))
        f = messageUtil.sendMessage(MessageType.SMS_152441016.toString(), yanzhengma, phone);
        if (type.equals("login"))
        f = messageUtil.sendMessage(MessageType.SMS_152441018.toString(), yanzhengma, phone);


        Result result = new Result();
        if(f) {
            HttpSession session = httpServletRequest.getSession();
            if(type.equals("register"))
            session.setAttribute("yanzhengma", yanzhengma);
            if(type.equals("login"))
                session.setAttribute("login", yanzhengma);


            session.setMaxInactiveInterval(70);

            result.setStatus(true);
        }
        else {
            result.setStatus(false);
            result.setMessage("发送失败！");
        }

        return  result;

    }
    //注册用户
    @RequestMapping("/user/register")
    public  Result register(@RequestBody TbUser tbUser,String yanzhengma,HttpServletRequest request){
        String yanzhengma1 =(String) request.getSession().getAttribute("yanzhengma");
        if(yanzhengma.equals(yanzhengma1)) {
            MyLog.logger.info("注册用户："+tbUser);
            Result insert = userService.insert(tbUser);
            return insert;
        }
        else {

            return  new Result("验证码错误或已过期",false);
        }
    }
    //用户登录
    @RequestMapping("/user/login")
    public Result login(@RequestBody TbUser tbUser, String yanzhengma,
                        HttpServletRequest request, HttpServletResponse response){

        MyLog.logger.info("登录用户："+tbUser);

        String username=tbUser.getUsername();
        if(username==null||username.equals("")){//如果传入用户名字段不存在就是用手机号登录
            String phone=tbUser.getPhone();
            String yanzhengma1 =(String) request.getSession().getAttribute("login");
            if(yanzhengma.equals(yanzhengma1)) {//验证码匹配
                Result result=userService.loginWithPhone(phone);
                //获取到手机号对应的用户名

                request.getSession().setAttribute("userInf",result.getData());
                /*Cookie cookie=new Cookie("username",user);
                //生存时间
                cookie.setMaxAge(60*60*24*5);
                //添加cookies
                response.addCookie(cookie);*/
                return result;
            }else {//验证码不匹配
                return  new Result("验证码错误或已过期",false);
            }
        }else {
            String password=tbUser.getPassword();
            Map<String,String> map=new HashMap<String,String>();
            map.put("username",username);
            map.put("password",password);
            Result result=userService.login(map);
            if(result.isStatus()){//登录成功

                request.getSession().setAttribute("userInf",result.getData());

                /*Cookie cookie=new Cookie("username",username);
                cookie.setMaxAge(60*60*24*5);//生存时间
                response.addCookie(cookie);*/
            }
            return result;
        }

    }
    @RequestMapping("/getLogin")
    public TbUser getUserLogin(HttpServletRequest request){


        Object username = request.getSession().getAttribute("userInf");
        return  (TbUser) username;


    }
    //提交审核资料
    @RequestMapping("/user/save")
    public Result saveShenhe(@RequestBody TbDriver tbDriver){

        tbDriver.setStatus(1);
        MyLog.logger.info("审核资料："+tbDriver);
        return  driverService.saveShenhe(tbDriver);


    }
    //更新用户资料
    @RequestMapping("/user/update")
    public Result updateUser(@RequestBody TbUser tbUser){
        MyLog.logger.info("更新用户信息："+tbUser);

     return     userService.update(tbUser);


    }









}
