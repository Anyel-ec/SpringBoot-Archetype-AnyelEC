package top.anyel.ec.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 10/01/2025
 */

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Anyel EC",
                version = "1.0",
                description = """
                    Archetype
                    """,
                contact = @Contact(name = "Developed by Angel Patiño", email = "appatino@espe.edu.ec", url = "www.anyel.top"),
                license = @License(name = "Apache License 2.0", url = "")
        ),
        servers = @Server(url = "http://localhost:8080")
)
public class OpenApiConfig {
}
