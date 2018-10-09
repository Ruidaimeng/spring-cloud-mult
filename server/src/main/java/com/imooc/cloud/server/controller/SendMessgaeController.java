package com.imooc.cloud.server.controller;

import com.imooc.cloud.server.message.StreamClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * 消息发送
 *
 * @author ruimeng
 * @create 2018-10-08 19:53
 **/
@RestController
public class SendMessgaeController {

    @Autowired
    private StreamClient streamClient ;

    @GetMapping("/sendMessage")
    public void process(){
        System.out.println("========发送消息");
        streamClient.output().send(
                MessageBuilder.withPayload("now"+new Date()).build()
        );
    }

}
