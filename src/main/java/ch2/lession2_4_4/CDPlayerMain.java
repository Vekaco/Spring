package ch2.lession2_4_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/configs/ch2/lession2_4_4/p_naming_space.xml");
        CDPlayer cdPlayer = context.getBean("cdPlayer2", CDPlayer.class);
        cdPlayer.play();
        context.close();
    }
}
