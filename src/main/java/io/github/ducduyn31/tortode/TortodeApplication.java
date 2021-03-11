package io.github.ducduyn31.tortode;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "APIs",
                version = "1.0",
                description = "Documentation for Tortode API"
        )
)
public class TortodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TortodeApplication.class, args);
    }

}
