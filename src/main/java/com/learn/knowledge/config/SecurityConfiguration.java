package com.learn.knowledge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@EnableWebMvc
@Configuration
public class SecurityConfiguration {

    private ApiInfo apiInfo() {
        return new ApiInfo("Learning Spring app",
                "An app to learn different Spring modules",
                "1.0",
                "Pablo Ramirez",
                new Contact("Pablo", "https://pablors.github.io/page404.github.io/", "prmzs89@hotmail.com"),
                "free",
                "free",
                Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
