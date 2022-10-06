package org.example.Task3.config;

import org.example.Task3.models.Car;
import org.example.Task3.models.Weight;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Car getCar () {
        return new Car();
    }

    @Bean
    public Weight getWeight () {
        return new Weight();
    }
}
