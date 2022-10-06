package org.example.Task2.models.quests;

import org.springframework.stereotype.Component;

@Component
public interface Quest {
    void startQuest () throws InterruptedException;
    void endQuest ();
}
