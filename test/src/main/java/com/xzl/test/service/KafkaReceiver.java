package com.xzl.test.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2020/5/9 17:27
 * @version: v0.0.1
 * @history:
 */
@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(topics = "topic1", groupId = "topicGroupId1")
    public void processMessage(ConsumerRecord<Integer, String> record) {
        log.info("kafka processMessage start");
        log.info("processMessage, topic = {}, msg = {}", record.topic(), record.value());
        log.info("kafka processMessage end");
    }
}
