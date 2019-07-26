package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.mapper.TbPersonMapper;
import com.pps.suanjiaotyong.pojo.TbPerson;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname PerserviceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/19 13:49
 * @Vestion 1.0
 **/
@Service
public class PerserviceImp implements PerService {
    @Autowired
    private TbPersonMapper tbPersonMapper;

    @Override
    public Result save(TbPerson tbPerson) {

        Result result=new Result();
        try{

            tbPersonMapper.insertSelective(tbPerson);
            result.setStatus(true);
            result.setData(tbPerson);
        }
        catch (Exception e){

            result.setStatus(false);

        }

        return result;
    }

    @Override
    public TbPerson getOneById(int id) {


        return tbPersonMapper.selectByPrimaryKey(id);
    }

    @Override
    public Result update(TbPerson tbPerson) {
        Result result=new Result();
        try{

            tbPersonMapper.updateByPrimaryKeySelective(tbPerson);
            result.setStatus(true);
            result.setData(tbPerson);
        }
        catch (Exception e){

            result.setStatus(false);

        }

        return result;
    }
}
