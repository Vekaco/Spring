package ch4.lession4_3_1;

import ch4.lession4_3_1.configs.JavaConfig;
import ch4.lession4_3_1.performances.Performance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PerformanceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Performance performance = context.getBean(Performance.class);
        performance.perform();
    }
}
