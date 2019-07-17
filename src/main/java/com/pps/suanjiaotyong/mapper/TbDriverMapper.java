package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.pojo.TbDriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDriverMapper {
    int countByExample(TbDriverExample example);

    int deleteByExample(TbDriverExample example);

    int insert(TbDriver record);

    int insertSelective(TbDriver record);

    List<TbDriver> selectByExample(TbDriverExample example);

    int updateByExampleSelective(@Param("record") TbDriver record, @Param("example") TbDriverExample example);

    int updateByExample(@Param("record") TbDriver record, @Param("example") TbDriverExample example);
}