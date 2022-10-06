package org.example.Task2.models.quests;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component ("first")
public class FirstQuestImpl implements Quest{

    @Override
    public void startQuest() throws InterruptedException {
        System.out.println("First quest is started !");
        TimeUnit.SECONDS.sleep(3);
        endQuest();
    }

    @Override
    public void endQuest() {
        System.out.println("First quest is done !");
    }
}
