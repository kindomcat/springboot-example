package com.xzl.kafka.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2020/5/9 17:06
 * @version: v0.0.1
 * @history:
 */
@ConfigurationProperties("kafka.topic")
@Data
public class KafkaTopicProperties {

    private String groupId;
    private String[] topicName;
}
