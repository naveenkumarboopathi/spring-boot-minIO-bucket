package com.develop.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinioConfig {

    @Value("${minio.access.name}")
    private String accessKey;

    @Value("${minio.access.secret}")
    private String accessSecret;

    @Value("${minio.url}")
    private String accessURL;

    @Bean
    public MinioClient configureMiniIOClient() {
        MinioClient client = MinioClient.builder()
                .endpoint(accessURL)
                .credentials(accessKey, accessSecret)
                .build();
        return client;
    }
}
