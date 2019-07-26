package com.pps.suanjiaotyong.serviceImp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.mapper.DriverpublishMapper;

import com.pps.suanjiaotyong.pojo.CompanypublishExample;
import com.pps.suanjiaotyong.pojo.Driverpublish;
import com.pps.suanjiaotyong.pojo.DriverpublishExample;
import com.pps.suanjiaotyong.pojo.TbDriver;
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

            if(driverpublish.getLoadtime()!=null){

                criteria.andLoadtimeGreaterThanOrEqualTo(driverpublish.getLoadtime());

            }
            if(driverpublish.getUnloadtime()!=null){

                criteria.andUnloadtimeLessThanOrEqualTo(driverpublish.getUnloadtime());
            }
            if(driverpublish.getCartype()!=null&&driverpublish.getCartype().length()>0){

                criteria.andCartypeEqualTo(driverpublish.getCartype());
            }



        }

        Page<Driverpublish> page= (Page<Driverpublish>)driverpublishMapper.selectByExample(example);

        Map map=new HashMap();
        map.put("rows",page.getResult());
        map.put("totalItems",page.getTotal());

        return map;
    }

    @Override
    public Driverpublish getOneById(String id) {

      return   driverpublishMapper.selectByPrimaryKey(id);

    }

    @Override
    public Map getAllMatch(Driverpublish driverpublish, int pageNum, int pageSize) {


        DriverpublishExample example=new DriverpublishExample();
        example.setOrderByClause("lever desc");
        DriverpublishExample.Criteria criteria = example.createCriteria();
        Map map=new HashMap();


        if(driverpublish.getNeedtype()!=null&&!driverpublish.getNeedtype().equals("")){

            criteria.andNeedtypeEqualTo(driverpublish.getNeedtype());
        }


        //整车匹配

        if(driverpublish!=null&&driverpublish.getNeedtype().equals("整车")){

            String formAddress="",toAddress="";
            String formAddress2="",toAddress2="";

            if(driverpublish.getFromaddress()!=null&&!driverpublish.getFromaddress().equals("")){
                formAddress=driverpublish.getFromaddress();
            }
            if(driverpublish.getToaddress()!=null&&!driverpublish.getToaddress().equals("")){
                toAddress=driverpublish.getToaddress();
            }

            int f1=formAddress.length();
            int f2=toAddress.length();


            //根据起点匹配起点位置
            for(int i=0;i<f1;i++){

                List<TbDriver> list= driverpublishMapper.selectByFromAddress(formAddress.substring(0, f1 - i)+"%");
                if(list!=null&&list.size()>0){
                    formAddress2=formAddress.substring(0, f1 - i);
                    break;
                }

             }

            //根据最佳匹配终点地址
             for(int i=0;i<f2;i++){
                List<TbDriver> list= driverpublishMapper.selectByToAddress(toAddress.substring(0, f2 - i)+"%");
                if(list!=null&&list.size()>0){
                 toAddress2=toAddress.substring(0, f2 - i);
                    break;
                }
             }



              if(formAddress2.equals("")||toAddress2.equals("")){

                map.put("rows",null);
                map.put("totalItems",0);
                return  map;

               }

            MyLog.logger.info("匹配出发地址最佳-整车："+formAddress2);
            MyLog.logger.info("匹配终点地址最佳-整车："+toAddress2);

                criteria.andFromaddressLike(formAddress2+"%");
                criteria.andToaddressLike(toAddress2+"%");


            if(driverpublish.getLinkname()!=null && driverpublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+driverpublish.getLinkname()+"%");
            }
            if(driverpublish.getCartype()!=null && driverpublish.getCartype().length()>0){
                criteria.andCartypeLike("%"+driverpublish.getCartype()+"%");
            }
            if(driverpublish.getLoadtime()!=null){
                criteria.andLoadtimeGreaterThanOrEqualTo(driverpublish.getLoadtime());
            }
            if(driverpublish.getUnloadtime()!=null){
                criteria.andUnloadtimeLessThanOrEqualTo(driverpublish.getUnloadtime());
            }
            if(driverpublish.getCarweight()!=null){

                criteria.andCarheightLessThanOrEqualTo(driverpublish.getCarweight());

            }



        }



        //零担匹配
        if(driverpublish!=null&&driverpublish.getNeedtype().equals("零担")){



            String formAddress="",toAddress="";
            String formAddress2="",toAddress2="";

            if(driverpublish.getFromaddress()!=null&&!driverpublish.getFromaddress().equals("")){
                formAddress=driverpublish.getFromaddress();
            }
            if(driverpublish.getToaddress()!=null&&!driverpublish.getToaddress().equals("")){
                toAddress=driverpublish.getToaddress();
            }
            int f1=formAddress.length();
            int f2=toAddress.length();
            boolean flag=false;

           //根据最佳的匹配出发地址
            for(int i=0;i<f1;i++){

                List<TbDriver> list= driverpublishMapper.selectByFromAddress(formAddress.substring(0, f1 - i)+"%");
                if(list!=null&&list.size()>0){
                    formAddress2=formAddress.substring(0, f1 - i);
                    break;
                }

            }
            MyLog.logger.info("匹配出发地址最佳-零担："+formAddress2);

            //根据最佳匹配终点地址
            for(int i=0;i<f2;i++){
                List<TbDriver> list= driverpublishMapper.selectByToAddress(toAddress.substring(0, f2 - i)+"%");
                if(list!=null&&list.size()>0){
                    toAddress2=toAddress.substring(0, f2 - i);
                    break;
                }
            }
            MyLog.logger.info("匹配终点地址最佳-零担："+toAddress2);
            //如果终点匹配不到 则中途经路线找 若找不到 则返回空 表示没有类似路线的
            if(toAddress2.equals("")){

                 flag=true;
                for(int i=0;i<f2;i++){
                    List<TbDriver> list= driverpublishMapper.selectByRouteAddress("%"+toAddress.substring(0, f2 - i)+"%");
                    if(list!=null&&list.size()>0){
                        toAddress2=toAddress.substring(0, f2 - i);
                        break;
                    }
                }

                MyLog.logger.info("匹配终点地址最佳(途经)-零担："+toAddress2);

            }

            if(formAddress2.equals("")||toAddress2.equals("")){

                map.put("rows",null);
                map.put("totalItems",0);
                return  map;

            }

            if(flag){

                criteria.andFromaddressLike(formAddress2+"%");
                criteria.andRouteLike("%"+toAddress2+"%");


            }else {
                criteria.andFromaddressLike(formAddress2+"%");
                criteria.andToaddressLike(toAddress2+"%");
            }


            if(driverpublish.getLinkname()!=null && driverpublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+driverpublish.getLinkname()+"%");
            }

            if(driverpublish.getCartype()!=null && driverpublish.getCartype().length()>0){
                criteria.andCartypeLike("%"+driverpublish.getCartype()+"%");
            }
            if(driverpublish.getLoadtime()!=null){
                criteria.andLoadtimeGreaterThanOrEqualTo(driverpublish.getLoadtime());
            }
            if(driverpublish.getUnloadtime()!=null){
                criteria.andUnloadtimeLessThanOrEqualTo(driverpublish.getUnloadtime());
            }
            if(driverpublish.getCarweight()!=null){

                criteria.andCarheightLessThanOrEqualTo(driverpublish.getCarweight());

            }

        }

        PageHelper.startPage(pageNum,pageSize);

        Page<Driverpublish> page= (Page<Driverpublish>)driverpublishMapper.selectByExample(example);

        map.put("rows",page.getResult());
        map.put("totalItems",page.getTotal());

        return map;


    }
}
