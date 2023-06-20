package com.example.examp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class ExampApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampApplication.class, args);
    }
    @Bean
    public DataSource getDataSource(ComonConfig config) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(config.databaseDriver);
        dataSourceBuilder.url(config.databaseUrl);
        dataSourceBuilder.username(config.databaseUsername);
        dataSourceBuilder.password(config.databasePassword);
        return dataSourceBuilder.build();
    }


}
