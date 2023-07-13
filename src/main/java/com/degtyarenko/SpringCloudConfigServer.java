package com.degtyarenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Описание класса
 *
 * @author Volha Dzehtsiarenka
 * @since ${DATE}
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer.class, args);
    }
}
