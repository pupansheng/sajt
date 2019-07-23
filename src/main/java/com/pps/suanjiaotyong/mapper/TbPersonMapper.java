package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.TbPerson;
import com.pps.suanjiaotyong.pojo.TbPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPersonMapper {
    int countByExample(TbPersonExample example);

    int deleteByExample(TbPersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPerson record);

    int insertSelective(TbPerson record);

    List<TbPerson> selectByExample(TbPersonExample example);

    TbPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPerson record, @Param("example") TbPersonExample example);

    int updateByExample(@Param("record") TbPerson record, @Param("example") TbPersonExample example);

    int updateByPrimaryKeySelective(TbPerson record);

    int updateByPrimaryKey(TbPerson record);
}