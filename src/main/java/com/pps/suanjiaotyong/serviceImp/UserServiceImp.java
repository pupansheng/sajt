package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.mapper.TbUserMapper;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

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
            tbUserMapper.insert(tbUser);
            result.setStatus(true);
        }
        catch (Exception e){

            result.setStatus(false);
            result.setMessage(e.getMessage());
        }

        return result;

    }

}
