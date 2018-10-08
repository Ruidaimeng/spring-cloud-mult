package com.imooc.cloud.client.message;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接受Mq消息
 *
 * @author ruimeng
 * @create 2018-10-07 16:21
 **/
@Component
public class MqReceiver {

   // @RabbitListener(queues = "myQueue")
    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    public void presess(String message){
        System.out.println("myQueue:"+message);
    }


}
