package org.example.Task4;

import org.example.Task4.user.User;
import org.example.Task4.user.UserImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        User user1 = applicationContext.getBean(UserImpl.class);
        user1.doSomething();
    }
}
