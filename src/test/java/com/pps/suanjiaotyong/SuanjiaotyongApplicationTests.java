package com.pps.suanjiaotyong;

import com.pps.suanjiaotyong.mapper.TbUserMapper;
import com.pps.suanjiaotyong.pojo.TbUser;
import com.pps.suanjiaotyong.pojo.TbUserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuanjiaotyongApplicationTests {

	@Autowired
	TbUserMapper tbUserMapper;
	@Test
	public void contextLoads() {
	}
	@Test
	public void test(){
		TbUserExample ex=new TbUserExample();
		TbUserExample.Criteria criteria = ex.createCriteria();
		criteria.andUsernameEqualTo("saa");
		List<TbUser> user=tbUserMapper.selectByExample(ex);//查询用户信息
		if(user.isEmpty()){
			System.out.println("为空");
		}else{
			System.out.println("other");
		}
	}
	@Test
	public void md5(){
		String password="test";
		String md5password= DigestUtils.md5DigestAsHex(password.getBytes());
		String md5password2=DigestUtils.md5DigestAsHex(password.getBytes());
		System.out.println("==========================");
		System.out.println(md5password);
		System.out.println(md5password2);
	}
}
