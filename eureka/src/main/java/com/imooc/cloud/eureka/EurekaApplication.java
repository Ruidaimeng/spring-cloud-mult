package com.imooc.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //注解这个是eurker的服务端
public class EurekaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(EurekaApplication.class, args);
	}
}