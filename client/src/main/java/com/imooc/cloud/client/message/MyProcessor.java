package com.imooc.cloud.client.message;/*
 * Description
 *@author Ruimeng
 *@Date 2018/10/12 13:32
 */

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 *
 * 自定义通道，用于定义输出，输入的通道
 * @author ruimeng
 * @create 2018-09-12 20:41
 **/
public interface MyProcessor {

    String OUTPUT1= "myInput1";
    String OUTPUT2= "myInput2";
    String INPUT1 = "myOutput1";
    String INPUT2 = "myOutput2";

    @Input(MyProcessor.INPUT1)         //消息接受端的输入通道，对应于消息发送者的输出通道。
    SubscribableChannel myInput1();

    @Input(MyProcessor.INPUT2)
    SubscribableChannel myInput2();

    @Output(MyProcessor.OUTPUT1)   //消息接受端的输出通道，对应于消息发送者的输入通道。
    MessageChannel myOutput1();

    @Output(MyProcessor.OUTPUT2)
    MessageChannel myOutput2();
}
