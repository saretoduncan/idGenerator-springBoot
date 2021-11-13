package com.example.idGenerator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api"))
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .build()
        .apiInfo(metaInfo());
    }
    private ApiInfo metaInfo() {
        return new ApiInfo(
                "IdGenerator REST API", //title
                "generates unique id", //description
                "Version 1.0", //version
                "Terms of service", //terms of service URL
                new Contact("Duncan Moiyo", "", "duncan.moiyo@gmail.com"),
                "License of API", "API license URL", Collections.emptyList()); // contact info
    }
}
