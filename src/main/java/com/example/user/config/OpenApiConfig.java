package com.example.user.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2 // Enable Swagger 2
// public class SwaggerConfig {

//     @Bean
//     public Docket api() {
//         return new Docket(DocumentationType.SWAGGER_2)
//                 .select()
//                 .apis(RequestHandlerSelectors.basePackage("com.example.user.controller"))
//                 .paths(PathSelectors.any())
//                 .build();
//     }
// }
// import org.springdoc.core.GroupedOpenApi;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class OpenApiConfig {

//     @Bean
//     public GroupedOpenApi publicApi() {
//         return GroupedOpenApi.builder()
//                 .group("public")
//                 .pathsToMatch("/**")
//                 .build();
//     }
// }
