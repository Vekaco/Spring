package ch2.lession2_4_3;

import ch2.lession2_2_1.cds.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlankDiscMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/configs/ch2/lession2_4_3/c_naming_space.xml");
        CompactDisc cd = context.getBean("blankDisc2",BlankDisc2.class);
        cd.play();
        context.close();
    }
}
