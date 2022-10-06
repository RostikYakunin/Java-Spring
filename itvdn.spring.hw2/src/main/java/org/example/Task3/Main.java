package org.example.Task3;

import org.example.Task3.config.Configuration;
import org.example.Task3.models.Car;
import org.example.Task3.models.Weight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        Car car = context.getBean(Car.class);
        car.setWeight(context.getBean(Weight.class));
        System.out.println("car = " + car);

    }
}
