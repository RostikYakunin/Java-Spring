package org.example.Task3.models;

import lombok.*;

@Data
public class Car {
    private int id = 1;
    private String model = "BMW";
    private int speed = 205;
    private Weight weight;

}
