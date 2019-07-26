package com.pps.suanjiaotyong.mapper;

import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.pojo.DriverpublishExample;
import java.util.List;

import com.pps.suanjiaotyong.pojo.TbDriver;
import org.apache.ibatis.annotations.Param;

public interface DriverpublishMapper {
    int countByExample(DriverpublishExample example);

    int deleteByExample(DriverpublishExample example);

    int deleteByPrimaryKey(String id);

    int insert(Driverpublish record);

    int insertSelective(Driverpublish record);

    List<Driverpublish> selectByExample(DriverpublishExample example);

    Driverpublish selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Driverpublish record, @Param("example") DriverpublishExample example);

    int updateByExample(@Param("record") Driverpublish record, @Param("example") DriverpublishExample example);

    int updateByPrimaryKeySelective(Driverpublish record);

    int updateByPrimaryKey(Driverpublish record);
    List<TbDriver> selectByFromAddress(String address);
    List<TbDriver> selectByToAddress(String address);
    List<TbDriver> selectByRouteAddress(String address);

}