package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanypublishMapper {
    int countByExample(CompanypublishExample example);

    int deleteByExample(CompanypublishExample example);

    int deleteByPrimaryKey(String id);

    int insert(Companypublish record);

    int insertSelective(Companypublish record);

    List<Companypublish> selectByExample(CompanypublishExample example);

    Companypublish selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Companypublish record, @Param("example") CompanypublishExample example);

    int updateByExample(@Param("record") Companypublish record, @Param("example") CompanypublishExample example);

    int updateByPrimaryKeySelective(Companypublish record);

    int updateByPrimaryKey(Companypublish record);
}