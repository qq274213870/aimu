package com.xqt.rbacclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qingtao/xiang
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RbacClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacClientApplication.class, args);
    }
}
