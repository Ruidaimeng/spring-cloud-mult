package com.imooc.cloud.server.controller;/*
 * Description
 *@author Ruimeng
 *@Date 2018/10/12 13:44
 */

import com.imooc.cloud.server.message.MyProcessor;
import com.imooc.cloud.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProcessorSendController {

    @Autowired
    private MyProcessor myProcessor ;

    @RequestMapping("/sendMessage1")
    public void  sendMessage1(){
        myProcessor.myOutput1().send(
                MessageBuilder.withPayload("发出消息===============》》》》》"+new Date()).build()
        );
    }

    @RequestMapping("/sendMessage2")
    public void  sendMessage2(){
        User user= new User();
        user.setAge(12);
        user.setName("张三");
        myProcessor.myOutput1().send(
                MessageBuilder.withPayload(user).build()
        );
    }

}
