package com.pps.suanjiaotyong.controller;

import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.pojo.*;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.CompanyPulishService;
import com.pps.suanjiaotyong.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private CompanyService companyService;

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

    @RequestMapping("/get/companyPulishById/{id}")
    public Companypublish getCompanyById(@PathVariable("id") String id){


        return  companyPulishService.getCompanyById(id);

    }

    @RequestMapping("/get/companyInfoById/{id}")
    public TbCompany getinfoById(@PathVariable("id") int id){

        return  companyService.getOneById(id);


    }
    //匹配算法 找到合适的货主
    @RequestMapping("/company/pulish/match/page/")
    public Map getAllMatch(@RequestBody Companypublish companypublish, int pageNum, int pageSize){

        MyLog.logger.info("车主查询实体："+companypublish+"pageNum="+pageNum+"pageSize="+pageSize);

        Map allByPageByCondition = companyPulishService.getAllMatch(companypublish, pageNum, pageSize);


        return   allByPageByCondition;

    }


}
