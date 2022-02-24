package com.example.gittest;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GitTestApplication.class, args);

        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
        System.out.println(beanFactory);


    }

}
