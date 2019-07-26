package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import com.pps.suanjiaotyong.pojo.group.Result;

import java.util.List;
import java.util.Map;

public interface CompanyPulishService {

    public Result save(CompanypublishWithBLOBs companypublish);
    public Map save2(CompanypublishWithBLOBs companypublish);

    List<CompanypublishWithBLOBs> getAll();
    List<Companypublish> getAllBy(Companypublish companypublish);
    public Map getAllByPageByCondition(Companypublish companypublish,int pageNum,int pageSize);

    Companypublish getCompanyById(String id);

    Map getAllMatch(Companypublish companypublish, int pageNum, int pageSize);
}
