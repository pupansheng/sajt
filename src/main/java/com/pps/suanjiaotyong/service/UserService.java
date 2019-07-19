package com.pps.suanjiaotyong.service;

import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.pojo.TbUser;

import java.util.Map;

public interface UserService {
    public Result insert(TbUser tbUser);
    public Result login(Map<String,String> map);
    public Result loginWithPhone(String phone);

    Result update(TbUser tbUser);
}
