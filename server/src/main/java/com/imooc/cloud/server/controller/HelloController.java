package com.imooc.cloud.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author ruimeng
 * @create 2018-09-12 20:41
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is second messge";
    }
}
