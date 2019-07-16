package com.pps.suanjiaotyong.mapper;


import com.pps.suanjiaotyong.pojo.Tborder;
import com.pps.suanjiaotyong.pojo.TborderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface TborderMapper {
    int countByExample(TborderExample example);

    int deleteByExample(TborderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tborder record);

    int insertSelective(Tborder record);

    List<Tborder> selectByExample(TborderExample example);

    Tborder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tborder record, @Param("example") TborderExample example);

    int updateByExample(@Param("record") Tborder record, @Param("example") TborderExample example);

    int updateByPrimaryKeySelective(Tborder record);

    int updateByPrimaryKey(Tborder record);
}