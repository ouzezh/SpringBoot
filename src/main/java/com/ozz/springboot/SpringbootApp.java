package com.ozz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties({Settings.class})
@EnableScheduling
//@ImportResource(locations={"classpath:spring-context.xml"})
public class SpringbootApp {

  private static ApplicationContext ctx;

  public static void main(String[] args) {
    ctx = SpringApplication.run(SpringbootApp.class, args);
  }

  public static ApplicationContext getApplicationContext() {
    return ctx;
  }

}
