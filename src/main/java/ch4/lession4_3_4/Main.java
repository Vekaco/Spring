package ch4.lession4_3_4;

import ch4.lession4_3_1.performances.Performance;
import ch4.lession4_3_4.configs.JavaConfig;
import ch4.lession4_3_4.encoreables.Encoreable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Performance performance = context.getBean(Performance.class);
        performance.perform();

        //重点在这里 https://blog.csdn.net/u010502101/article/details/76944753
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performanceEncore();

    }
}
