package com.imooc.cloud.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类注入LoadBanlanceTmeplate
 *
 * @author ruimeng
 * @create 2018-09-17 19:22
 **/

@Component
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
    return  new RestTemplate();
    }
}
