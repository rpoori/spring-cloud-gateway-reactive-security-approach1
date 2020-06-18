package com.my.poc.springcloudgatewayreactivesecurityapproach1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    CustomReactiveAuthenticationManager customReactiveAuthenticationManager() {
        return new CustomReactiveAuthenticationManager();
    }

    @Bean
    CustomSecurityContextRepository customSecurityContextRepository(
                    CustomReactiveAuthenticationManager customReactiveAuthenticationManager
            ) {
        return new CustomSecurityContextRepository(customReactiveAuthenticationManager);
    }
}
