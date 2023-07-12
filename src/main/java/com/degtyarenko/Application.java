package com.degtyarenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Описание класса
 *
 * @author Volha Dzehtsiarenka
 * @since ${DATE}
 */
@SpringBootApplication
@ConfigurationPropertiesScan
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
