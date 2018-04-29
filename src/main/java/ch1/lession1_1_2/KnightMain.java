package ch1.lession1_1_2;

import ch1.lession1_1_2.configs.KnightConfig;
import ch1.lession1_1_2.knights.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        //XML配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/configs/ch1/lession1_1_2/knights.xml");

        //Java配置
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

    }
}
