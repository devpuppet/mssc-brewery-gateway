package com.kkukielka.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//@Profile("google")
//@Configuration
public class GoogleConfig {

    @Bean
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/googlesearch4")
                        .filters(f -> f.rewritePath("/googlesearch4(?<segment>/?.*)", "/${segment}"))
                .uri("https://google.com")
                .id("google"))
                .build();

    }

}