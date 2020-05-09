package com.xzl.rabbitmq.integration.example;

import com.senscape.assets.common.message.annotation.EnableRabbitmq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbitmq
public class RabbitmqIntegrationExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqIntegrationExampleApplication.class, args);
    }

}
