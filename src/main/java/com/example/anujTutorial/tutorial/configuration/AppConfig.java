package com.example.anujTutorial.tutorial.configuration;

import com.example.anujTutorial.tutorial.DB;
import com.example.anujTutorial.tutorial.DevDb;
import com.example.anujTutorial.tutorial.ProdDb;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean() {
        return new DevDb();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean() {
        return new ProdDb();
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}

