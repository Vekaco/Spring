package ch1.lession1_1_2.quests;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }
    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
