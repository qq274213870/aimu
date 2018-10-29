package com.xqt.aimuserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qingtao/xiang
 */
@SpringBootApplication
@EnableEurekaServer
public class AimuServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AimuServerApplication.class, args);
    }
}
