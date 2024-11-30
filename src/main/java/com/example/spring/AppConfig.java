package com.example.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
    @Profile("english")
    public GreetingService englishGreetingService() {
        return new EnglishGreetingService();
    }

    @Bean
    @Profile("french")
    public GreetingService frenchGreetingService() {
        return new FrenchGreetingService();
    }
}
