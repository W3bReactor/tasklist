package com.example.tasklist.service.props;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "security.jwt")
public class JwtProperties {
    // Секретный ключ JWT для подписи и проверки токенов
    private String secret;

    // Время истечения access токена в миллисекундах
    private Long access;

    // Время истечения refresh токена в миллисекундах
    private Long refresh;
}
