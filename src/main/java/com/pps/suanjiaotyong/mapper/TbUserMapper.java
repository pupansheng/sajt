package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.pojo.TbUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    int NameJudge(Map<String,String> map);

    int loginPasswordJudge(Map<String,String> map);

    int PhoneJudge(String phone);

    String foundUsernameByPhone(String phone);
}