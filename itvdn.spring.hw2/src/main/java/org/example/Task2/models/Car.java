package org.example.Task2.models;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String model;
    private int speed;
    private Weight weight;

    public Car (int id) {
        this.id = id;
    }


}
