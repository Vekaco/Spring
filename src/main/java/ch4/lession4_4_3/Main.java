package ch4.lession4_4_3;

import ch4.lession4_3_3.cds.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/configs/ch4/lession4_4_3/track_counter.xml");



        TrackCounter trackCounter = context.getBean(TrackCounter.class);

        CompactDisc cd = (CompactDisc) context.getBean("cd");
        cd.play(0);
        cd.play(1);
        cd.play(2);

        System.out.println( trackCounter.getPlayCount(1));


    }
}
