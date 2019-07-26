package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.pojo.TbDriver;

import java.util.List;
import java.util.Map;

public interface DriverPulishService {

    public Map save(Driverpublish driverpublish);

    List<Driverpublish> getAll();

    Map getAllByPageByCondition(Driverpublish driverpublish,int pageNum,int pageSize);

    Driverpublish getOneById(String id);

    Map getAllMatch(Driverpublish driverpublish, int pageNum, int pageSize);
}
