package top.anyel.ec.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 12/01/2025
 */
@Configuration
public class MailConfig {

    @Value("${app.smtp.user}")
    private String username;

    @Value("${app.smtp.password}")
    private String password;

    @Value("${app.smtp.to}")
    private String to;

    @Value("${app.smtp.port}")
    private int port;
    @Value("${app.smtp.without.host}")
    private String host;


    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setUsername(username);
        mailSender.setPassword(password);

        // properties for SMTP server
        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);

        return mailSender;
    }
}
