package com.pps.suanjiaotyong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.pps.suanjiaotyong.mapper")
public class SuanjiaotyongApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuanjiaotyongApplication.class, args);
	}

}
