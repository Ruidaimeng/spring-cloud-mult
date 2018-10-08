package com.imooc.cloud.client.fallback;


import com.imooc.cloud.client.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断后的降级操作类
 *
 * @author ruimeng
 * @create 2018-09-13 20:12
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
