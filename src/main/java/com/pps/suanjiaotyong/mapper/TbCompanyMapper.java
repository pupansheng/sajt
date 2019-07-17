package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.TbCompany;
import com.pps.suanjiaotyong.pojo.TbCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCompanyMapper {
    int countByExample(TbCompanyExample example);

    int deleteByExample(TbCompanyExample example);

    int insert(TbCompany record);

    int insertSelective(TbCompany record);

    List<TbCompany> selectByExample(TbCompanyExample example);

    int updateByExampleSelective(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);

    int updateByExample(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);
}