package com.imooc.cloud.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 发送消息
 *
 * @author ruimeng
 * @create 2018-10-07 16:26
 * rabbitMQ 发送消息
 **/


@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageSender {
    @Autowired
    private AmqpTemplate amqpTemplate ;

    @Test
    public void send (){
        amqpTemplate.convertAndSend("myQueue","message1123"+ new Date());
    }

}
