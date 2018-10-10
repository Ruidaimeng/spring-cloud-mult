package com.imooc.cloud.server.controller;

import com.imooc.cloud.server.message.SinkSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 使用Sink发送消息
 *
 * @author ruimeng
 * @create 2018-10-10 20:19
 **/
@RestController
public class SinkSenderController {

    @Autowired
    private SinkSender sinkSender;

    @RequestMapping("/sendMessage")
    public void sinkSenderSend() {
        sinkSender.output().send(
                MessageBuilder.withPayload("produce a message to " + Sink.INPUT + " channel"+new Date()).build());
    }


}
