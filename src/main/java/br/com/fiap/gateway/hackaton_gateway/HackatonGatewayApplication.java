package br.com.fiap.gateway.hackaton_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HackatonGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonGatewayApplication.class, args);
	}

}
