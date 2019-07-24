package com.pps.suanjiaotyong.controller;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.CompanyPulishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Classname CompanyController
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/22 15:50
 * @Vestion 1.0
 **/
@RestController
public class CompanyController {


    @Autowired
    private CompanyPulishService companyPulishService;

    @RequestMapping("/company/pulish/save")
    public Map save(@RequestBody CompanypublishWithBLOBs companypublish){

         return  companyPulishService.save2(companypublish);

    }

    @RequestMapping("/company/pulish/list")
    public List<CompanypublishWithBLOBs> getAll(){

        return  companyPulishService.getAll();

    }
    @RequestMapping("/company/pulish/list/by")
    public List<Companypublish> getAll(@RequestBody Companypublish companypublish){

        MyLog.logger.info("条件查询："+companypublish);
        return  companyPulishService.getAllBy(companypublish);

    }




    @RequestMapping("/company/pulish/list/page")
    public Map getAll(int pageNum,int pageSize,@RequestBody Companypublish companypublish){

        return  companyPulishService.getAllByPageByCondition(companypublish,pageNum,pageSize);

    }


}
