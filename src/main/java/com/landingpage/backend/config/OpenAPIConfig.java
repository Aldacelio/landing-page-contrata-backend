package com.landingpage.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("aldacelio368@gmail.com");
        contact.setName("Landing Page Contrata+ API");

        Info info = new Info()
            .title("Landing Page API Documentation")
            .version("1.0")
            .contact(contact)
            .description("API para gerenciamento de dados da landing page.");

        return new OpenAPI().info(info);
    }
}
