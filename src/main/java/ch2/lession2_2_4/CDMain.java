package ch2.lession2_2_4;

import ch2.lession2_2_4.config.CDPlayerConfig;
import ch2.lession2_2_4.players.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();

    }
}
