package ch2.lession2_5_1;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_4_4.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDConfig.class)
@ImportResource("classpath:/configs/ch2/lession2_4_4/p_naming_space.xml")
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer111(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCompactDisc(compactDisc);
        return cdPlayer;
    }
}
