package com.imooc.cloud.server.message;/*
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

    String INPUT1= "myInput1";
    String INPUT2= "myInput2";
    String OUTPUT1 = "myOutput1";
    String OUTPUT2 = "myOutput2";

    @Input(MyProcessor.INPUT1)         //没有指定通道名称，spring会根据方法名，创建通道。
    SubscribableChannel myInput1();

    @Input(MyProcessor.INPUT2)         //没有指定通道名称，spring会根据方法名，创建通道。
    SubscribableChannel myInput2();

    @Output(MyProcessor.OUTPUT1)
    MessageChannel myOutput1();

    @Output(MyProcessor.OUTPUT2)
    MessageChannel myOutput2();
}
