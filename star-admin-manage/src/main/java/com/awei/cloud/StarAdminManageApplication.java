package com.awei.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.awei.cloud.dao")
public class StarAdminManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarAdminManageApplication.class, args);
	}

}
