package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.mapper.TbUserMapper;
import com.pps.suanjiaotyong.pojo.TbUserExample;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname UserServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/17 10:03
 * @Vestion 1.0
 **/
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public Result insert(TbUser tbUser) {

        Result result=new Result();

        try {
            Map<String, String> map=new HashMap<>();
            map.put("username",tbUser.getUsername());
            map.put("password",tbUser.getPassword());
            int userCount=tbUserMapper.NameJudge(map);
            if (userCount==0) {//判断用户是否存在
                int phoneCount=tbUserMapper.PhoneJudge(tbUser.getPhone());
                if (phoneCount==0) {//判断手机号是否存在
                    tbUserMapper.insert(tbUser);
                }
            }
            result.setStatus(true);
        }
        catch (Exception e){

            result.setStatus(false);
            result.setMessage(e.getMessage());
        }

        return result;

    }

    @Override
    public Result login(Map<String, String> map) {
        int userCount=tbUserMapper.NameJudge(map);
        Result result=new Result();
        if(userCount>0){//用户名存在
            int success=tbUserMapper.loginPasswordJudge(map);
            if (success>0){//密码匹配
                result.setStatus(true);
                TbUserExample ex=new TbUserExample();
                TbUserExample.Criteria criteria = ex.createCriteria();
                criteria.andUsernameEqualTo(map.get("username"));
                criteria.andPasswordEqualTo(map.get("password"));
                //查询用户信息
                List<TbUser> user=tbUserMapper.selectByExample(ex);
                result.setData(user.get(0));
                result.setMessage("登录成功");
            }else {
                result.setStatus(false);
                result.setMessage("密码错误");
            }
        }else{
            result.setStatus(false);
            result.setMessage("用户名不存在");
        }
        return result;
    }

    @Override
    public Result loginWithPhone(String phone) {
        int phoneCount=tbUserMapper.PhoneJudge(phone);
        Result result=new Result();
        if (phoneCount>0){//手机号码存在
            String username=tbUserMapper.foundUsernameByPhone(phone);
            //登录成功返回用户名
            result.setMessage(username);
            //查询用户信息
            TbUserExample ex=new TbUserExample();
            TbUserExample.Criteria criteria = ex.createCriteria();
            criteria.andUsernameEqualTo(phone);
            List<TbUser> user=tbUserMapper.selectByExample(ex);
            result.setData(user.get(0));
            result.setStatus(true);
        }else {
            result.setMessage("手机号不存在");
            result.setStatus(false);
        }
        return result;
    }


}
