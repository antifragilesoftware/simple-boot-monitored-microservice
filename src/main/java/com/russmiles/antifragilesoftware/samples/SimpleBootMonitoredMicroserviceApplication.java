package com.russmiles.antifragilesoftware.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleBootMonitoredMicroserviceApplication {

    @RequestMapping("/")
    public String home() {
        return this.toString() + " instance saying: Hello Microservice World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootMonitoredMicroserviceApplication.class, args);
    }
}
