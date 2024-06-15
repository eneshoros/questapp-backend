package com.project.questappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class QuestappBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestappBackendApplication.class, args);
    }

}
