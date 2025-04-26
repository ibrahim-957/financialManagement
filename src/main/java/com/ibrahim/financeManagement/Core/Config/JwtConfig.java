package com.ibrahim.financeManagement.Core.Config;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;

@Configuration
@ConfigurationProperties(prefix = "app.jwt") // Ensure prefix matches properties
public class JwtConfig {
    private String secret; // Matches app.jwt.secret
    private long expirationInMs; // Matches app.jwt.expirationInMs

    // Remove @Value annotations
    public String getSecret() { return secret; }
    public void setSecret(String secret) { this.secret = secret; }

    public long getExpirationInMs() { return expirationInMs; }
    public void setExpirationInMs(long expirationInMs) {
        this.expirationInMs = expirationInMs;
    }

    @Bean
    public SecretKey jwtSecretKey() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
    }

    @Bean
    public Long jwtExpirationInMs() {
        return expirationInMs;
    }
}