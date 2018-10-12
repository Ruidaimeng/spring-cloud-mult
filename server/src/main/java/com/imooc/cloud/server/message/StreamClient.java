package com.imooc.cloud.server.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/*
 *使用stream,发送和获取消息
* */

public interface StreamClient  {
    @Input("myMessage")
    SubscribableChannel input();

    @Output("myMessage")
    MessageChannel output();

}
