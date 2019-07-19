package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.mapper.TbDriverMapper;
import com.pps.suanjiaotyong.mapper.TbUserMapper;
import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname DriverServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/18 16:26
 * @Vestion 1.0
 **/
@Service
public class DriverServiceImp implements DriverService{

    @Autowired
    private TbDriverMapper tbDriverMapper;

    @Override
    public Result saveShenhe(TbDriver tbDriver) {

        Result result=new Result();
        try{

            tbDriverMapper.insertSelective(tbDriver);

            result.setStatus(true);
            result.setData(tbDriver);

        }
        catch (Exception e){
            result.setStatus(false);
            result.setMessage(e.getMessage());

        }

        return result;
    }
}
