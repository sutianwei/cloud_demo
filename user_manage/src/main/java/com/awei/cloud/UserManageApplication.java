package com.awei.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.awei.cloud.dao")
@EnableScheduling
@EnableEurekaClient
public class UserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManageApplication.class, args);
	}

}
