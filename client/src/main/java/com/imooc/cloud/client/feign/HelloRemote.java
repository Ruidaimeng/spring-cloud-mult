package com.imooc.cloud.client.feign;


import com.imooc.cloud.client.fallback.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
@Repository
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
