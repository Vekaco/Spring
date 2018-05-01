package ch3.lession3_3_2.configs;

import ch3.lession3_3_2.orders.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3.lession3_3_2")
public class JavaConfig {

    @Bean
    public Order getOrder(){
        return new Order();
    }
}
