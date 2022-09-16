package com.mu.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MUZUKI
 */

@Configuration
public class RouterConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("path_rote_guonei", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("path_rote_guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"))
                .route("path_rote_tech", r -> r.path("/tech").uri("http://news.baidu.com/tech"))
                .route("path_rote_lady", r -> r.path("/lady").uri("http://news.baidu.com/lady"))
                .build();
    }
}
