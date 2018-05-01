package ch2.lession2_4_3;

import ch2.lession2_2_1.cds.CompactDisc;

import java.util.List;

public class BlankDisc2 implements CompactDisc{
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc2(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("track:" + track);
        }
    }
}
