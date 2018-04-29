package ch1.lession1_1_2.knights;

import ch1.lession1_1_2.quests.RescueDamselQuest;

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        quest = new RescueDamselQuest();//与RescueDamselQuest紧耦合
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();

    }
}
