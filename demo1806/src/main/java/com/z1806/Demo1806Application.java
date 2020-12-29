package com.z1806;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.z1806.dao")
public class Demo1806Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1806Application.class, args);
	}

}
