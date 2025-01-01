package com.buildmyrig.core.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Build my rig core apis").version("1.0").description("API documentation with swagger"));
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Redirect the root URL to Swagger UI
        registry.addViewController("/").setViewName("redirect:/swagger-ui/index.html");
    }
}
