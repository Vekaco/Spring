package ch2.lession2_5_1;

import ch2.lession2_4_4.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer cdPlayer = context.getBean("cdPlayer111",CDPlayer.class);
        cdPlayer.play();
        context.close();


        ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("/configs/ch2/lession2_5_1/composite.xml");
        CDPlayer xmlPlayer = xml.getBean(CDPlayer.class);
        xmlPlayer.play();
        xml.close();
    }
}
