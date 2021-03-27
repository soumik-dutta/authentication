package com.wip.soumik.autthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value ={"com.wip.soumik.autthentication","com.wip.soumik.security"})
public class AutthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutthenticationApplication.class, args);
    }

}
