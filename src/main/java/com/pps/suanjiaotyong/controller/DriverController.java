package com.pps.suanjiaotyong.controller;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.service.DriverPulishService;
import com.pps.suanjiaotyong.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

/**
 * @Classname DriverController
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/23 13:52
 * @Vestion 1.0
 **/
@RestController
public class DriverController {

    @Autowired
    private DriverPulishService driverPulishService;
    @Autowired
    private DriverService driverService;

    @RequestMapping("/driver/pulish/save")
    public Map save(@RequestBody Driverpublish driverpublish){

        return  driverPulishService.save(driverpublish);
    }
    @RequestMapping("/driver/pulish/list")
    public List<Driverpublish> getAll(){

        return  driverPulishService.getAll();
    }
    @RequestMapping("/driver/pulish/list/page/")
    public Map getAllByPageByCondition(@RequestBody Driverpublish driverpublish,int pageNum,int pageSize){

        MyLog.logger.info("车主查询实体："+driverpublish);

        Map allByPageByCondition = driverPulishService.getAllByPageByCondition(driverpublish, pageNum, pageSize);


        return   allByPageByCondition;

    }

    //匹配算法 找到合适的车主
    @RequestMapping("/driver/pulish/match/page/")
    public Map getAllMatch(@RequestBody Driverpublish driverpublish,int pageNum,int pageSize){

        MyLog.logger.info("车主查询实体："+driverpublish+"pageNum="+pageNum+"pageSize="+pageSize);

        Map allByPageByCondition = driverPulishService.getAllMatch(driverpublish, pageNum, pageSize);


        return   allByPageByCondition;

    }


    @RequestMapping("/get/driverPulishById/{id}")
    public Driverpublish getById(@PathVariable("id") String id){


        return  driverPulishService.getOneById(id);



    }

    @RequestMapping("/get/driverInfoById/{id}")
    public TbDriver  getinfoById(@PathVariable("id") int id){

        return  driverService.getOneById(id);


    }



}
