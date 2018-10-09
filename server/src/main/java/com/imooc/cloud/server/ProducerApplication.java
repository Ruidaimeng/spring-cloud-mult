package com.imooc.cloud.server;

import com.imooc.cloud.server.message.StreamClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding(StreamClient.class)  //加上此注解，才能注入接口。
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
