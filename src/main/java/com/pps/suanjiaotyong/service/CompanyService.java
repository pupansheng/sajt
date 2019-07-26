package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.TbCompany;
import com.pps.suanjiaotyong.pojo.TbPerson;
import com.pps.suanjiaotyong.pojo.group.Result;

import java.util.Map;

/**
 * @Classname CompanyService
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/19 13:50
 * @Vestion 1.0
 **/
public interface CompanyService {
    Result save(TbCompany tbCompany);

    TbCompany getOneById(int id);

    Result update(TbCompany tbCompany);

}
