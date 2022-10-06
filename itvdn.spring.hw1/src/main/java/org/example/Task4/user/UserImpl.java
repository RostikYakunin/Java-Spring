package org.example.Task4.user;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserImpl implements User{
    private String name;
    private int age;

    @Override
    public void doSomething() {
        System.out.println("Do something");
    }
}
