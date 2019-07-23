package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import com.pps.suanjiaotyong.pojo.group.Result;

import java.util.List;
import java.util.Map;

public interface CompanyPulishService {

    public Result save(CompanypublishWithBLOBs companypublish);
    public Map save2(CompanypublishWithBLOBs companypublish);

    List<CompanypublishWithBLOBs> getAll();
}
