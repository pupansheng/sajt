package com.pps.suanjiaotyong.serviceImp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pps.suanjiaotyong.MyLog;
import com.pps.suanjiaotyong.mapper.CompanypublishMapper;
import com.pps.suanjiaotyong.pojo.Companypublish;
import com.pps.suanjiaotyong.pojo.CompanypublishExample;
import com.pps.suanjiaotyong.pojo.CompanypublishWithBLOBs;
import com.pps.suanjiaotyong.pojo.TbDriver;
import com.pps.suanjiaotyong.pojo.group.Result;
import com.pps.suanjiaotyong.service.CompanyPulishService;
import com.pps.suanjiaotyong.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname CompanyPulishServiceImp
 * @Description
 * @@Author Pupansheng
 * @Date 2019/7/22 15:56
 * @Vestion 1.0
 **/
@Service
public class CompanyPulishServiceImp implements CompanyPulishService {

    @Autowired
    private CompanypublishMapper companypublishMapper;
    @Autowired
    private IdWorker idWorker;

    public Result save(CompanypublishWithBLOBs companypublish){

        Result result=new Result();

        try{

            companypublish.setId(String.valueOf(idWorker.nextId()));
            companypublish.setStatus(1);
            Date date=new Date();
            companypublish.setCreatetime(date);

            MyLog.logger.info("企业发布订单信息："+companypublish);

            companypublishMapper.insert(companypublish);

            Map<String,Object> map=new HashMap<>();
            map.put("id",String.valueOf(idWorker.nextId()));
            map.put("status",1);
            map.put("createtime",date);
            map.put("flag",true);

            result.setStatus(true);
            result.setData(map);
          }
        catch (Exception e){
            result.setStatus(false);
            e.printStackTrace();
            result.setMessage("出错！");

        }

      return  result;
    }
    public Map save2(CompanypublishWithBLOBs companypublish){

        Result result=new Result();
        Map<String,Object> map=new HashMap<>();
        try{

            String id=String.valueOf(idWorker.nextId());

            companypublish.setId(id);
            companypublish.setStatus(1);
            Date date=new Date();
            companypublish.setCreatetime(date);

            MyLog.logger.info("企业发布订单信息："+companypublish);

            map.put("flag",false);
            companypublishMapper.insertSelective(companypublish);

            map.put("id",id);
            map.put("status",1);
            map.put("createtime",date);
            map.put("flag",true);


        }
        catch (Exception e){
            result.setStatus(false);
            e.printStackTrace();
            result.setMessage("出错！");

        }

        return  map;
    }

    //查询全部数据
    @Override
    public List<CompanypublishWithBLOBs> getAll() {

        return companypublishMapper.selectByExampleWithBLOBs(null);
    }

    //条件查询 全部
    @Override
    public List<Companypublish> getAllBy(Companypublish companypublish) {

        CompanypublishExample example=new CompanypublishExample();
        CompanypublishExample.Criteria criteria = example.createCriteria();

        if(companypublish!=null){
            if(companypublish.getId()!=null && companypublish.getId().length()>0){
                criteria.andIdLike("%"+companypublish.getId()+"%");
            }
            if(companypublish.getLinkname()!=null && companypublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+companypublish.getLinkname()+"%");
            }
            if(companypublish.getLinkphone()!=null && companypublish.getLinkphone().length()>0){
                criteria.andLinkphoneLike("%"+companypublish.getLinkphone()+"%");
            }
            if(companypublish.getGoodsname()!=null && companypublish.getGoodsname().length()>0){
                criteria.andGoodsnameLike("%"+companypublish.getGoodsname()+"%");
            }
            if(companypublish.getNeedtype()!=null && companypublish.getNeedtype().length()>0){
                criteria.andNeedtypeLike("%"+companypublish.getNeedtype()+"%");
            }
            if(companypublish.getFromaddress()!=null && companypublish.getFromaddress().length()>0){
                criteria.andFromaddressLike("%"+companypublish.getFromaddress()+"%");
            }
            if(companypublish.getToaddress()!=null && companypublish.getToaddress().length()>0){
                criteria.andToaddressLike("%"+companypublish.getToaddress()+"%");
            }
        }


        return  companypublishMapper.selectByExample(example);
    }

    @Override
    public Map getAllByPageByCondition(Companypublish companypublish,int pageNum,int pageSize) {

        return    getAllByPage(companypublish,pageNum,pageSize);
    }

    @Override
    public Companypublish getCompanyById(String id) {

     return   companypublishMapper.selectByPrimaryKey(id);

    }

    @Override
    public Map getAllMatch(Companypublish companypublish, int pageNum, int pageSize) {

        Map map=new HashMap();

        CompanypublishExample example=new CompanypublishExample();

        example.setOrderByClause("lever desc");

        CompanypublishExample.Criteria criteria = example.createCriteria();

        if(companypublish!=null&&!companypublish.getFromaddress().equals("")&&!companypublish.getToaddress().equals("")){


            String formAddress="",toAddress="";
            String formAddress2="",toAddress2="";

            if(companypublish.getFromaddress()!=null&&!companypublish.getFromaddress().equals("")){
                formAddress=companypublish.getFromaddress();
            }
            if(companypublish.getToaddress()!=null&&!companypublish.getToaddress().equals("")){
                toAddress=companypublish.getToaddress();
            }

            int f1=formAddress.length();
            int f2=toAddress.length();



            //根据起点匹配起点位置
            for(int i=0;i<f1;i++){

                criteria.andFromaddressLike(formAddress.substring(0,f1-i)+"%");
                List<Companypublish> list= companypublishMapper.selectByExample(example);
                if(list!=null&&list.size()>0){
                    formAddress2=formAddress.substring(0, f1 - i);
                    break;
                }

            }

            //根据最佳匹配终点地址
            for(int i=0;i<f2;i++){
                criteria.andToaddressLike(toAddress.substring(0,f2-i)+"%");
                List<Companypublish> list= companypublishMapper.selectByExample(example);
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


        }


        if(companypublish!=null){


            if(companypublish.getGoodsweight()!=null){

                criteria.andGoodsweightLessThanOrEqualTo(companypublish.getGoodsweight());
            }

            if(companypublish.getLinkname()!=null && companypublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+companypublish.getLinkname()+"%");
            }
            if(companypublish.getLinkphone()!=null && companypublish.getLinkphone().length()>0){
                criteria.andLinkphoneLike("%"+companypublish.getLinkphone()+"%");
            }
            if(companypublish.getGoodsname()!=null && companypublish.getGoodsname().length()>0){
                criteria.andGoodsnameLike("%"+companypublish.getGoodsname()+"%");
            }
            if(companypublish.getNeedtype()!=null && companypublish.getNeedtype().length()>0){
                criteria.andNeedtypeLike("%"+companypublish.getNeedtype()+"%");
            }

            if(companypublish.getLoadtime()!=null ){
                criteria.andLoadtimeGreaterThanOrEqualTo(companypublish.getLoadtime());
            }
            if(companypublish.getUnloadtime()!=null){

                criteria.andUnloadtimeLessThanOrEqualTo(companypublish.getUnloadtime());
            }
            if(companypublish.getCartype()!=null&&companypublish.getCartype().length()>0){

                criteria.andCartypeEqualTo(companypublish.getCartype());
            }

        }

        PageHelper.startPage(pageNum,pageSize);
        Page<Companypublish> page= (Page<Companypublish>)companypublishMapper.selectByExample(example);

        map.put("rows",page.getResult());
        map.put("totalItems",page.getTotal());

        return  map;


    }


    public Map getAllByPage(Companypublish companypublish,int pageNum,int pageSize) {


         PageHelper.startPage(pageNum,pageSize);
         CompanypublishExample example=new CompanypublishExample();

         example.setOrderByClause("lever desc");

         CompanypublishExample.Criteria criteria = example.createCriteria();

        if(companypublish!=null){
            if(companypublish.getId()!=null && companypublish.getId().length()>0){
                criteria.andIdLike("%"+companypublish.getId()+"%");
            }
            if(companypublish.getLinkname()!=null && companypublish.getLinkname().length()>0){
                criteria.andLinknameLike("%"+companypublish.getLinkname()+"%");
            }
            if(companypublish.getLinkphone()!=null && companypublish.getLinkphone().length()>0){
                criteria.andLinkphoneLike("%"+companypublish.getLinkphone()+"%");
            }
            if(companypublish.getGoodsname()!=null && companypublish.getGoodsname().length()>0){
                criteria.andGoodsnameLike("%"+companypublish.getGoodsname()+"%");
            }
            if(companypublish.getNeedtype()!=null && companypublish.getNeedtype().length()>0){
                criteria.andNeedtypeLike("%"+companypublish.getNeedtype()+"%");
            }
            if(companypublish.getFromaddress()!=null && companypublish.getFromaddress().length()>0){
                criteria.andFromaddressLike("%"+companypublish.getFromaddress()+"%");
            }
            if(companypublish.getToaddress()!=null && companypublish.getToaddress().length()>0){
                criteria.andToaddressLike("%"+companypublish.getToaddress()+"%");
            }

           if(companypublish.getLoadtime()!=null ){
               criteria.andLoadtimeGreaterThanOrEqualTo(companypublish.getLoadtime());
            }
            if(companypublish.getUnloadtime()!=null){

               criteria.andUnloadtimeLessThanOrEqualTo(companypublish.getUnloadtime());
            }
            if(companypublish.getCartype()!=null&&companypublish.getCartype().length()>0){


                criteria.andCartypeEqualTo(companypublish.getCartype());
            }

        }

        Page<Companypublish> page= (Page<Companypublish>)companypublishMapper.selectByExample(example);
        Map map=new HashMap();

        map.put("rows",page.getResult());
        map.put("totalItems",page.getTotal());

        return  map;
    }

}
