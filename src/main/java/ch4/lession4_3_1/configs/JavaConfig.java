package ch4.lession4_3_1.configs;

import ch4.lession4_3_1.audiences.Audience;
import ch4.lession4_3_1.performances.MyPerformance;
import ch4.lession4_3_1.performances.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "ch4.lession4_3_1")
public class JavaConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new MyPerformance();
    }
}
