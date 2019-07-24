package com.pps.suanjiaotyong.controller;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.service.DriverPulishService;
import org.springframework.beans.factory.annotation.Autowired;
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




}
