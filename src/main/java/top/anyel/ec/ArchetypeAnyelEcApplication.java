package top.anyel.ec;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchetypeAnyelEcApplication {

    public static void main(String[] args) {
        // Load the .env file using Dotenv
        Dotenv dotenv = Dotenv.configure().load();


        System.setProperty("ALERT_SMTP_HOST", dotenv.get("ALERT_SMTP_HOST", ""));
        System.setProperty("ALERT_SMTP_FROM", dotenv.get("ALERT_SMTP_FROM", ""));
        System.setProperty("ALERT_SMTP_USER", dotenv.get("ALERT_SMTP_USER", ""));
        System.setProperty("ALERT_SMTP_PASSWORD", dotenv.get("ALERT_SMTP_PASSWORD", ""));
        System.setProperty("ALERT_SMTP_TO", dotenv.get("ALERT_SMTP_TO", ""));
        System.setProperty("ALERT_SMTP_PORT", dotenv.get("ALERT_SMTP_PORT", ""));
        System.setProperty("ALERT_SMTP_HOST_WITHOUT_PORT", dotenv.get("ALERT_SMTP_HOST_WITHOUT_PORT", ""));

        SpringApplication.run(ArchetypeAnyelEcApplication.class, args);

    }

}
