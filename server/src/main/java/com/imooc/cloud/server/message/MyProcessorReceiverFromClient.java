package com.imooc.cloud.server.message;/*
 * Description
 *@author Ruimeng
 *@Date 2018/10/12 13:58
 */


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;


/*
   用于接受从消息接受者返回的消息。
  */

@EnableBinding(value = {MyProcessor.class})
public class MyProcessorReceiverFromClient {


    @StreamListener(MyProcessor.INPUT1)
    public void  receive(Object payload) {
        //接受到客户端返回的消息
        System.out.println(" 已经获取到消息了============》 Received from Client  MyProcessor.INPUT1 channel :"+ payload.toString());
        //反馈消息
    }

    /*@StreamListener(MyProcessor.OUTPUT1 )
    public void receive2(Object payload) {
        //接受客户端返回的消息
        System.out.println("Received from default MyProcessor.OUTPUT1 channel :"+ payload.toString());


    }*/
}
