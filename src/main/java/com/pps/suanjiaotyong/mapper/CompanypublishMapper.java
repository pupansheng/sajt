package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishExample;
import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanypublishMapper {
    int countByExample(CompanypublishExample example);

    int deleteByExample(CompanypublishExample example);

    int deleteByPrimaryKey(String id);

    int insert(CompanypublishWithBLOBs record);

    int insertSelective(CompanypublishWithBLOBs record);

    List<CompanypublishWithBLOBs> selectByExampleWithBLOBs(CompanypublishExample example);

    List<Companypublish> selectByExample(CompanypublishExample example);

    CompanypublishWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CompanypublishWithBLOBs record, @Param("example") CompanypublishExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanypublishWithBLOBs record, @Param("example") CompanypublishExample example);

    int updateByExample(@Param("record") Companypublish record, @Param("example") CompanypublishExample example);

    int updateByPrimaryKeySelective(CompanypublishWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanypublishWithBLOBs record);

    int updateByPrimaryKey(Companypublish record);
}