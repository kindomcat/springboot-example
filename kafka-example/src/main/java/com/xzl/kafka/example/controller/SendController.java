package com.xzl.kafka.example.controller;

import com.xzl.kafka.example.service.IndicatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: XZL
 * @createTime: 2020/5/9 17:22
 * @version: v0.0.1
 * @history:
 */
@RestController
@AllArgsConstructor
public class SendController {

    private final IndicatorService indicatorService;

    @GetMapping("/test")
    public String test(){
        indicatorService.sendMessage("topic1","1111111");
        return "ok";
    }
}
