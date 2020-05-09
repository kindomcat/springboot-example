package com.xzl.test.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2020/5/8 15:27
 * @version: v0.0.1
 * @history:
 */
@Component
public class DirectReceiver {

    @RabbitHandler
    @RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
    public void process1(Object testMessage) {
        System.out.println(11111);
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
    public void process1back(Object testMessage) {
        System.out.println(222222);
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.man")//监听的队列名称 TestDirectQueue
    public void process2(Map testMessage) {
        System.out.println(3333);
        System.out.println("TopicManReceiver消费者【topic.man】收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.man")//监听的队列名称 TestDirectQueue
    public void process2back(Map testMessage) {
        System.out.println(4444444444L);
        System.out.println("TopicManReceiver消费者【topic.man】收到消息  : " + testMessage.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.woman")//监听的队列名称 TestDirectQueue
    public void process3(Map testMessage) {
        System.out.println("TopicManReceiver消费者【topic.woman】收到消息  : " + testMessage.toString());
    }

}
