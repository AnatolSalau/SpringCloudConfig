package com.example.spring_web_client;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringWebClientApplication {
      @Autowired
      private ApplicationContext applicationContext;

      public static void main(String[] args) {
            SpringApplication.run(SpringWebClientApplication.class, args);
      }

      @PostConstruct
      private void init() {
            System.out.println("Init method");
            System.out.println("propertiesTest1 : " + applicationContext.getEnvironment().getProperty("properties.test1", ""));
            System.out.println("propertiesTest2 : " + applicationContext.getEnvironment().getProperty("properties.test2", ""));
      }
      //
}
