package br.com.fiap.gateway.config;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class GatewayConfig {

    private final AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("hackaton-usuarios-app", r -> r.path("/api/usuarios/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://hackaton-usuarios-app"))
                .route("hackaton-pagamentos-app", r -> r.path("/api/pagamento/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://hackaton-pagamentos-app"))
                .build();
    }
}