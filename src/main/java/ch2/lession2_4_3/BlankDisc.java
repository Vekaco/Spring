package ch2.lession2_4_3;

import ch2.lession2_2_1.cds.CompactDisc;

public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
