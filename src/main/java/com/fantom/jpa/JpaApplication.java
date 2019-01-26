package com.fantom.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaApplication.class, args);
    System.out.println("----------web---started----------");
    System.out.println("【|||||||||||||||||||||||||】100%");
  }

}

