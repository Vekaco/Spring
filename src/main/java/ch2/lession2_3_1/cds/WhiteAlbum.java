package ch2.lession2_3_1.cds;

import ch2.lession2_2_1.cds.CompactDisc;

public class WhiteAlbum implements CompactDisc{
    private String title = "White Album";
    private String author = "leaf";
    @Override
    public void play() {

        System.out.println("Playing " + title + " by " + author);
    }
}
