package com.pps.suanjiaotyong.serviceImp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.mapper.DriverpublishMapper;

import com.pps.suanjiaotyong.pojo.CompanypublishExample;
import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.pojo.DriverpublishExample;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.DriverPulishService;
import com.pps.suanjiaotyong.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname DriverPulishServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/23 14:11
 * @Vestion 1.0
 **/
@Service
public class DriverPulishServiceImp implements DriverPulishService {

    @Autowired
    private DriverpublishMapper driverpublishMapper;
    @Autowired
    private IdWorker idWorker;



    @Override
    public Map save(Driverpublish driverpublish) {

        Map map=new HashMap();
        map.put("flag",false);
        try{
            String id=String.valueOf(idWorker.nextId());
            Date date=new Date();

            driverpublish.setId(id);
            driverpublish.setCreatetime(date);
            driverpublish.setStatus(1);

            MyLog.logger.info("司机发布信息："+driverpublish);
            driverpublishMapper.insertSelective(driverpublish);

            map.put("id",id);
            map.put("status",1);
            map.put("createtime",date);
            map.put("flag",true);



        }catch (Exception e){
            e.printStackTrace();
            map.put("flag",false);
            map.put("message","出错！");
        }

        return map;
    }

    @Override
    public List<Driverpublish> getAll() {
        return driverpublishMapper.selectByExample(null);
    }

    @Override
    public Map getAllByPageByCondition(Driverpublish driverpublish,int pageNum,int pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        DriverpublishExample example=new DriverpublishExample();
        example.setOrderByClause("lever desc");
        DriverpublishExample.Criteria criteria = example.createCriteria();


        if(driverpublish!=null){
            if(driverpublish.getId()!=null && driverpublish.getId().length()>0){
                criteria.andIdLike("%"+driverpublish.getId()+"%");
            }
            if(driverpublish.getLinkname()!=null && driverpublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+driverpublish.getLinkname()+"%");
            }
            if(driverpublish.getLinkphone()!=null && driverpublish.getLinkphone().length()>0){
                criteria.andLinkphoneLike("%"+driverpublish.getLinkphone()+"%");
            }
            if(driverpublish.getNeedtype()!=null && driverpublish.getNeedtype().length()>0){
                criteria.andNeedtypeLike("%"+driverpublish.getNeedtype()+"%");
            }
            if(driverpublish.getCartype()!=null && driverpublish.getCartype().length()>0){
                criteria.andCartypeLike("%"+driverpublish.getCartype()+"%");
            }
            if(driverpublish.getFromaddress()!=null && driverpublish.getFromaddress().length()>0){
                criteria.andFromaddressLike("%"+driverpublish.getFromaddress()+"%");
            }
            if(driverpublish.getToaddress()!=null && driverpublish.getToaddress().length()>0){
                criteria.andToaddressLike("%"+driverpublish.getToaddress()+"%");
            }
            if(driverpublish.getRoute()!=null && driverpublish.getRoute().length()>0){
                criteria.andRouteLike("%"+driverpublish.getRoute()+"%");
            }

        }

        Page<Driverpublish> page= (Page<Driverpublish>)driverpublishMapper.selectByExample(example);

        Map map=new HashMap();
        map.put("rows",page.getResult());
        map.put("totalItems",page.getTotal());

        return map;
    }
}
