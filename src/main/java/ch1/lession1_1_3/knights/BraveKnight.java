package ch1.lession1_1_3.knights;

import ch1.lession1_1_2.knights.Knight;
import ch1.lession1_1_2.quests.Quest;
import ch1.lession1_1_3.minstrel.Minstrel;

public class BraveKnight implements Knight{
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;//构造器注入Quest
        this.minstrel = minstrel;
    }
    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();//Knight不应该管理Minstrel。
        quest.embark();
        minstrel.singAfterQuest();

    }
}
