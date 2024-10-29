package com.gateway.APIGateway.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {
    public static final List<String> openApiEndPoints = List.of("/api/auth/register",
            "/api/auth/validate/user","/api/auth/token");

    public Predicate<ServerHttpRequest> isSecured = request -> openApiEndPoints
            .stream()
            .noneMatch(uri -> request
                    .getURI()
                    .getPath()
                    .contains(uri))	;
}

