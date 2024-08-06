package com.rodolfobrandao.backendapirabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class BackendApiRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApiRabbitMqApplication.class, args);
    System.out.println("Rodando a Api!...");
    }

}
