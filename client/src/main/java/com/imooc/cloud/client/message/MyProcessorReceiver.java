package com.imooc.cloud.client.message;/*
 * Description
 *@author Ruimeng
 *@Date 2018/10/12 13:58
 */


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;


@EnableBinding(value = {MyProcessor.class})  //绑定接口，绑定到消息代理接口
public class MyProcessorReceiver {

    /*@StreamListener(MyProcessor.OUTPUT1)
    public void receive(Object payload) {
        //接受到消息，进行消息处理
        System.out.println("Received from default channel :"+ payload.toString());
       //反馈消息

    }*/

    @StreamListener(MyProcessor.INPUT1)
    @SendTo((MyProcessor.OUTPUT1))//定义回执发送的消息通道
    public String  receive(Object payload) {
        //接受到消息，进行消息处理
        System.out.println("Received from default MyProcessor.OUTPUT1 channel :"+ payload.toString());
        //反馈消息
      return "已经获取到消息了============》";
    }

    @StreamListener(MyProcessor.INPUT2 )
    public void receive2(Object payload) {
        //接受消息
        System.out.println("Received from default MyProcessor.INPUT1 channel :"+ payload.toString());
        //返回消息

    }
}
