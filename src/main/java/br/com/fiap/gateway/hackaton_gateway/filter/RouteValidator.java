package br.com.fiap.gateway.hackaton_gateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/api/autenticacao/autenticar",
//            "/hackaton-clientes-app/v3/api-docs",
//            "/hackaton-cartao-app/v3/api-docs",
//            "/hackaton-pagamentos-app/v3/api-docs",
//            "/hackaton-autenticacao-app/v3/api-docs",
            "/eureka"
//            "/swagger-ui.html",
//            "/swagger-ui/**",
//            "/v3/api-docs/**",
//            "/v3/api-docs.yaml",
//            "/swagger-resources",
//            "/swagger-resources/**",
//            "/configuration/ui",
//            "/configuration/security",
//            "/swagger-ui/**",
//            "/webjars/**"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}
