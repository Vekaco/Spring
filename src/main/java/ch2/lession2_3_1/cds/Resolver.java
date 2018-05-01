package ch2.lession2_3_1.cds;

import ch2.lession2_2_1.cds.CompactDisc;

public class Resolver implements CompactDisc {
    private String title = "Resolver";
    private String author = "someone";
    @Override
    public void play() {

        System.out.println("Playing " + title + " by " + author);
    }
}
