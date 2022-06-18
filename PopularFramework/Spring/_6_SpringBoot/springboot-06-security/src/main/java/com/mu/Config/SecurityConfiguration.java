package com.mu.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


//public class SecurityConfiguration {
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeRequests(authorize -> authorize
//                        .anyRequest().authenticated()
//                        .antMatchers("/**")
//                        .antMatchers("/").permitAll()
//                        .antMatchers("/level1/**").hasRole("vip1")
//                        .antMatcher("/level2/**").hasRole("vip2")
//                        .antMatcher("/level3/**").hasRole("vip3")
//                )
//                .build();
//    }
//}

