package ch1.lession1_1_2.knights;

import ch1.lession1_1_2.quests.Quest;

public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;//构造器注入Quest
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();

    }
}
