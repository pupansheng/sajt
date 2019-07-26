package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.TbPerson;
import com.pps.suanjiaotyong.pojo.group.Result;

public interface PerService {

    public Result save(TbPerson tbPerson);

    TbPerson getOneById(int id);

    Result update(TbPerson tbPerson);
}
