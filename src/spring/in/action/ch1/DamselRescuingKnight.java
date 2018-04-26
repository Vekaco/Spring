package spring.in.action.ch1;

public class DamselRescuingKnight implements  Knight{
    private RescuingKnight quest;

    //与RescuingKnight紧密耦合
    public  DamselRescuingKnight() {
        this.quest = new RescuingKnight();
    }
    //只能借助ResuingKnight来完成embark任务。
    public void embarkOnQuest(){
        quest.embark();
    }
}
