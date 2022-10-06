package org.example.Task2.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Weight {
    private int weight;

    @Autowired
    public Weight init () {
        return new Weight();
    }
}
