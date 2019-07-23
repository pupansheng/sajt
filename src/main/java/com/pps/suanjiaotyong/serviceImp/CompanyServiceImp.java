package com.pps.suanjiaotyong.serviceImp;

import com.pps.suanjiaotyong.mapper.TbCompanyMapper;
import com.pps.suanjiaotyong.pojo.TbCompany;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname CompanyServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/19 13:50
 * @Vestion 1.0
 **/
@Service
public class CompanyServiceImp implements CompanyService {
    @Autowired
    private TbCompanyMapper tbCompanyMapper;
    @Override
    public Result save(TbCompany tbCompany) {

        Result result=new Result();
        try{

            tbCompanyMapper.insertSelective(tbCompany);
            result.setStatus(true);
            result.setData(tbCompany);
        }
        catch (Exception e){
            result.setStatus(false);
        }
        return result;
    }
}
