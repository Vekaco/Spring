package ch3.lession3_3_1;

import ch3.lession3_3_1.configs.JavaConfig;
import ch3.lession3_3_1.orders.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Order order = context.getBean(Order.class);
        context.close();
    }
}
