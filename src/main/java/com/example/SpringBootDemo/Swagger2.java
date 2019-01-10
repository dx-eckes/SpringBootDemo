package com.example.SpringBootDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestV1Api() {
        ApiInfo info =  new ApiInfoBuilder()
                .title("SpringBoot Demo Swagger RESTful APIs")
                .description("SpringBoot Demo Swagger API ")
                .termsOfServiceUrl("http://www.nontrace.com/")
                .contact(new Contact("无痕", "http://www.nontrace.com", "non_trace@163.com"))
                .version("1.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2).groupName("v1")
                .apiInfo(info)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/v1/.*"))
                .build();
    }
    @Bean
    public Docket createRestV2Api() {
        ApiInfo info =  new ApiInfoBuilder()
                .title("SpringBoot Demo Swagger RESTful APIs")
                .description("SpringBoot Demo Swagger API ")
                .termsOfServiceUrl("http://www.nontrace.com/")
                .contact(new Contact("无痕", "http://www.nontrace.com", "non_trace@163.com"))
                .version("2.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2).groupName("v2")
                .apiInfo(info)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/v2/.*"))
                .build();
    }
}
