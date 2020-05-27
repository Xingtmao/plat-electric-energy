package com.krd.kczx.plat.electric.controller;

import com.krd.kczx.plat.electric.dto.HelloDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: ruizhou.zhou
 * @Description: TODO
 * @Date: Created in 10:35 2020/5/27
 * @Modify By:
 */
@RestController
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public HelloDto sayHello() {
        LocalDateTime dateTime = LocalDateTime.now();
        return new HelloDto("hello at " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    /**
     * 获取所有服务
     */
    @GetMapping("/services")
    public Object services() {
        return discoveryClient.getServices();
    }
}
