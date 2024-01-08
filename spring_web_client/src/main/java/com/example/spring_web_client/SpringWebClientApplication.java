package com.example.spring_web_client;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebClientApplication {

      public static void main(String[] args) {
            SpringApplication.run(SpringWebClientApplication.class, args);
      }

      @PostConstruct
      private void init() {
            System.out.println("Init method");
      }

}
