package com.marketplace.ms_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Servidor Eureka — registro central de microservicios.
 *
 * @EnableEurekaServer activa el servidor de Service Discovery.
 * Todos los demás microservicios se registran aquí al iniciar.
 *
 * Dashboard visual: http://localhost:8761
 */
@EnableEurekaServer
@SpringBootApplication
public class MsEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsEurekaApplication.class, args);
    }
}
