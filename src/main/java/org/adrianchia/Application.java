package org.adrianchia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by adrianchia on 5/20/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.adrianchia", "com.auth0.spring.security.api"})
@EnableAutoConfiguration
@PropertySource("classpath:auth0.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
