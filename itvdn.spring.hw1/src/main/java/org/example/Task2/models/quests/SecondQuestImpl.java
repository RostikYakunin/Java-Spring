package org.example.Task2.models.quests;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component ("second")
public class SecondQuestImpl implements Quest{

    @Override
    public void startQuest() throws InterruptedException {
        System.out.println("Second quest is started !");
        TimeUnit.SECONDS.sleep(3);
        endQuest();
    }

    @Override
    public void endQuest() {
        System.out.println("Second quest is done !");
    }
}
