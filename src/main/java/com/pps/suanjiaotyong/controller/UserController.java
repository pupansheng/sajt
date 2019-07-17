package com.pps.suanjiaotyong.controller;



import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.group.MessageType;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.service.UserService;
import com.pps.suanjiaotyong.util.IdWorker;
import com.pps.suanjiaotyong.util.MessageUtil;
import com.pps.suanjiaotyong.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    //获得手机验证码
    @RequestMapping("/getYanzhengma")
    public Result getYanzhengma(String phone, HttpServletRequest httpServletRequest){

        String yanzhengma = String.valueOf(UUIDUtil.getNumber(5));
        boolean f = messageUtil.sendMessage(MessageType.SMS_152441016.toString(), yanzhengma, phone);
        Result result = new Result();
        if(f) {
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("yanzhengma", yanzhengma);
            session.setMaxInactiveInterval(70);
            result.setStatus(true);
            result.setData(yanzhengma);
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









}
