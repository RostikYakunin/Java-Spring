package org.example.Task2;


import org.example.Task2.models.Knight;
import org.example.Task2.models.quests.Quest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@ComponentScan
public class Main {

    static Logger logger;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("D:\\java\\untitled3\\src\\main\\resources\\logger.conf")) {
            LogManager.getLogManager().readConfiguration(fileInputStream);
            logger = Logger.getLogger(Main.class.getName());
            logger.setUseParentHandlers(false);
            logger.addHandler(new FileHandler());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        logger.log(Level.INFO, "applicationContext is done");

        Knight knight = applicationContext.getBean(Knight.class);
        logger.log(Level.INFO, "new knight is created");

        knight.setQuest(applicationContext.getBean("first",Quest.class));
        knight.startQuest();
        logger.log(Level.INFO, "first quest is started by knight");

        knight.setQuest(applicationContext.getBean("second", Quest.class));
        knight.startQuest();
        logger.log(Level.INFO, "second quest is started by knight");

    }
}