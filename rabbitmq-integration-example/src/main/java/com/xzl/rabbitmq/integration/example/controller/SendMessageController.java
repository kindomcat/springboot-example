package com.xzl.rabbitmq.integration.example.controller;

import com.senscape.assets.common.message.event.RabbitmqEvent;
import com.xzl.rabbitmq.integration.example.service.IRabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2020/5/8 17:40
 * @version: v0.0.1
 * @history:
 */
@RestController
public class SendMessageController {

    @Autowired
    private IRabbitMqSender rabbitMqSender;

    @GetMapping("/test")
    public void test(){
        rabbitMqSender.sendToMqtt("log.exchange","11111111111111");
    }

    @EventListener
    public void test1(RabbitmqEvent rabbitmqEvent){
        System.out.println("===========================================");
        System.out.println(rabbitmqEvent);
    }
}
