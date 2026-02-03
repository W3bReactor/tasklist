package com.example.tasklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.example.tasklist")
@EnableTransactionManagement
@EnableCaching
public class TasklistApplication {

    public static void main(final String[] args) {
        SpringApplication.run(TasklistApplication.class, args);
    }

}
