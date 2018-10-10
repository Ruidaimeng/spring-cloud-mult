package com.imooc.cloud.client.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 采用Sink作为默认的消息订阅通道
 *
 * @author ruimeng
 * @create 2018-10-10 20:14
 **/
@EnableBinding(value = {Sink.class})
public class SinkReceiver {
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("Received from default channel :"+ payload.toString());
    }
}
