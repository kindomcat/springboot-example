package com.xzl.rabbitmq.integration.example.service;

import com.senscape.assets.common.message.rabbitmq.RabbitMqConfiguration;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.Header;


/**
 * mqtt消息发送者
 * @author tonyp
 */
@MessagingGateway(defaultRequestChannel = RabbitMqConfiguration.CHANNEL_NAME_OUT)
public interface IRabbitMqSender {

    /**
     * 发送信息到MQTT服务器
     *
     * @param data 发送的文本
     */
    String ROUTING_KEY_HEADER = "replyRoutingKey";

    void sendToMqtt(@Header(ROUTING_KEY_HEADER)String topic,String data);

}
