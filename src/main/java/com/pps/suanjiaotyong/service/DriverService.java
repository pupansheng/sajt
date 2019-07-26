package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.pojo.group.Result;

public interface DriverService {
    public Result saveShenhe(TbDriver tbDriver);
    public TbDriver getOneById(int id);

    Result updateShenhe(TbDriver tbDriver);
}
