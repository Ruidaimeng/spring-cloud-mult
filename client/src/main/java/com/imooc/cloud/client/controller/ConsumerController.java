package com.imooc.cloud.client.controller;/*
 * Description
 *@author Ruimeng
 *@Date 2018/9/13 10:09
 */


import com.imooc.cloud.client.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {


   /* //第一方式, 采用  RestTemplate ；
    @RequestMapping("/hello/{name}")
    public String index2(@PathVariable("name") String name) {
        RestTemplate restTemplate =new RestTemplate();
        String response =  restTemplate.getForObject("http://localhost:8083/hello",String.class);
        return response;
    }*/

   //第二种，方式LoadBalancerClient，通过应用名获取url
  /* @Autowired
   private LoadBalancerClient  loadBalancerClient;
       @RequestMapping("/hello/{name}")
    public String index2(@PathVariable("name") String name) {
        RestTemplate restTemplate =new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-producer");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/hello");
        String response =  restTemplate.getForObject(url,String.class);
        return response;
    }*/

  //第三种方式 ,配置bean，注入restTemplate
  /* @Autowired
    private   RestTemplate restTemplate ;
    @RequestMapping("/hello/{name}")
    public String index2(@PathVariable("name") String name) {
        RestTemplate restTemplate = new RestTemplate();
        //加应用的名字
        String response = restTemplate.getForObject("http://spring-cloud-producer/hello", String.class);
        return response;
    }*/




    @Autowired
  private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
