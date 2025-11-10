package com.dbteam7.backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "DBTeam7 API",
                version = "v1",
                description = "DBTeam7 서비스에 대한 OpenAPI 문서",
                contact = @Contact(name = "DBTeam7"),
                license = @License(name = "Apache 2.0")
        )
)
public class OpenApiConfig {
}

