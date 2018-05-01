package ch4.lession4_3_4.configs;

import ch4.lession4_3_1.performances.MyPerformance;
import ch4.lession4_3_1.performances.Performance;
import ch4.lession4_3_4.aspects.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "ch4")
public class JavaConfig {
    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return  new EncoreableIntroducer();
    }
    @Bean
    public Performance performance() {
        return new MyPerformance();
    }
}
