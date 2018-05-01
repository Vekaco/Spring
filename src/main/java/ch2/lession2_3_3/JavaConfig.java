package ch2.lession2_3_3;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_1.cds.SgtPeppers;
import ch2.lession2_2_4.players.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return  new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    //注入方式:构造器注入
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
    //注入方式：setter注入
    @Bean
    public CDPlayer cdPlayer2(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        cdPlayer.setCompactDisc(compactDisc);
        return cdPlayer;
    }
}
