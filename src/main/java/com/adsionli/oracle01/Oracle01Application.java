package com.adsionli.oracle01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.adsionli.oracle01.mapper")
public class Oracle01Application {

	public static void main(String[] args) {
		SpringApplication.run(Oracle01Application.class, args);
	}
}
