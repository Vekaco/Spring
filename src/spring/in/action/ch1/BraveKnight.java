package spring.in.action.ch1;

public class BraveKnight implements Knight {

    private Quest quest;
    //通过构造器注入quest
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
