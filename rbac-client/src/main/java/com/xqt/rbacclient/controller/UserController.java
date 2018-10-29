package com.xqt.rbacclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qingtao/xiang
 * @Description:
 * @Date: Created in 11:34 2018/10/26
 */
@RestController
public class UserController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("test")
    public String test() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
