package com.imooc.cloud.server;

import com.imooc.cloud.server.message.MyProcessor;
import com.imooc.cloud.server.message.SinkSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;


@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({SinkSender.class,MyProcessor.class})  //加上此注解，才能注入接口。
@EnableFeignClients(basePackages="com.imooc.cloud.server")
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
