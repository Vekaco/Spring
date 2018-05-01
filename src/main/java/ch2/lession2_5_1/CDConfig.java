package ch2.lession2_5_1;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_1.cds.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
