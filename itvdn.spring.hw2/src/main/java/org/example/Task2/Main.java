package org.example.Task2;

import org.example.Task2.models.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Car car1 = context.getBean("car1", Car.class);

        System.out.println("car1 = " + car1);

    }
}