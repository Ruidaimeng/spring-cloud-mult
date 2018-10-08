package com.imooc.cloud.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取配置中心的数据
 *
 * @author ruimeng
 * @create 2018-10-07 12:57
 **/
@RestController
@RequestMapping("/env")
@RefreshScope //自动刷新配置
public class EnvController {

    @Value("${env}")
    private String env ;

    @GetMapping("/print")
    public String getEnv(){
        return env ;
    }


}
