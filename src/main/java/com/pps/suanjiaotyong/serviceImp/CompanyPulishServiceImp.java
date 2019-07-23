package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.mapper.CompanypublishMapper;
import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.CompanyPulishService;
import com.pps.suanjiaotyong.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname CompanyPulishServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/22 15:56
 * @Vestion 1.0
 **/
@Service
public class CompanyPulishServiceImp implements CompanyPulishService {

    @Autowired
    private CompanypublishMapper companypublishMapper;
    @Autowired
    private IdWorker idWorker;

    public Result save(CompanypublishWithBLOBs companypublish){

        Result result=new Result();

        try{

            companypublish.setId(String.valueOf(idWorker.nextId()));
            companypublish.setStatus(1);
            Date date=new Date();
            companypublish.setCreatetime(date);

            MyLog.logger.info("企业发布订单信息："+companypublish);

            companypublishMapper.insert(companypublish);

            Map<String,Object> map=new HashMap<>();
            map.put("id",String.valueOf(idWorker.nextId()));
            map.put("status",1);
            map.put("createtime",date);
            map.put("flag",true);

            result.setStatus(true);
            result.setData(map);
          }
        catch (Exception e){
            result.setStatus(false);
            e.printStackTrace();
            result.setMessage("出错！");

        }

      return  result;
    }
    public Map save2(CompanypublishWithBLOBs companypublish){

        Result result=new Result();
        Map<String,Object> map=new HashMap<>();
        try{

            companypublish.setId(String.valueOf(idWorker.nextId()));
            companypublish.setStatus(1);
            Date date=new Date();
            companypublish.setCreatetime(date);


            MyLog.logger.info("企业发布订单信息："+companypublish);
            map.put("flag",false);
            companypublishMapper.insert(companypublish);

            map.put("id",String.valueOf(idWorker.nextId()));
            map.put("status",1);
            map.put("createtime",date);
            map.put("flag",true);


        }
        catch (Exception e){
            result.setStatus(false);
            e.printStackTrace();
            result.setMessage("出错！");

        }

        return  map;
    }

    @Override
    public List<CompanypublishWithBLOBs> getAll() {

        return companypublishMapper.selectByExampleWithBLOBs(null);
    }

}
