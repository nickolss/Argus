package com.nickolss.argus_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
    @Value("${app.cors.corsOriginPatterns}")
    private String corsOriginPatterns;

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        var allowedOrigins = corsOriginPatterns.split(",");

        registry.addMapping("/**")
            .allowedOrigins(allowedOrigins);
    }
    
}
