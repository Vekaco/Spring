package ch3.lession3_3_1.configs;

import ch3.lession3_3_1.orders.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3.lession3_3_1")
public class JavaConfig {

    @Bean
    public Order getOrder(){
        return new Order();
    }
}
