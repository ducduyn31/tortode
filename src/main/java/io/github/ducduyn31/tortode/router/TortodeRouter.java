package io.github.ducduyn31.tortode.router;

import io.github.ducduyn31.tortode.handler.TortodeHandler;
import io.swagger.v3.oas.annotations.Operation;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class TortodeRouter {

    @Bean
    @RouterOperation(
            operation = @Operation(
                    operationId = "createTortode",
                    summary = "Creating a new tortode to contain and run code safely"
            )
    )
    public RouterFunction<ServerResponse> tortodesRoute(TortodeHandler tortodeHandler) {
        return RouterFunctions
                .route(POST("/tortode"), tortodeHandler::createTortode);
    }
}
