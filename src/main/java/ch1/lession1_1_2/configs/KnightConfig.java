package ch1.lession1_1_2.configs;

import ch1.lession1_1_2.knights.BraveKnight;
import ch1.lession1_1_2.knights.Knight;
import ch1.lession1_1_2.quests.Quest;
import ch1.lession1_1_2.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
