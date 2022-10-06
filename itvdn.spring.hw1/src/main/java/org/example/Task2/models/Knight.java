package org.example.Task2.models;

import lombok.Data;
import org.example.Task2.models.quests.Quest;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Data
public class Knight {

    private String name;
    private int age;
    private Quest quest;

    public Knight () {
    }

    public void startQuest () throws InterruptedException {
        System.out.println("Knight is getting quest !");
        quest.startQuest();
    }

}
