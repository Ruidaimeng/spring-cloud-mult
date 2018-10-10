package com.imooc.cloud.client.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * 使用stream获取消息
 *
 * @author ruimeng
 * @create 2018-10-08 19:47
 **/
//@Component
//@EnableBinding(StreamClient.class)
public class StreamReceiver {

    //消息接受端
    @StreamListener("myMessage")
    public void process(Object message){
        System.out.println("myMessage:"+message);
    }
}
