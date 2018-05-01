package ch2.lession2_3_1.configs;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_2.SgtPeppers;
import ch2.lession2_3_1.cds.HardDaysNight;
import ch2.lession2_3_1.cds.Resolver;
import ch2.lession2_3_1.cds.WhiteAlbum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
    //显示装配
    @Bean(name = "lonelyHeartClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc getRandomCd(){
       int choice = (int) Math.floor(Math.random() * 4);

       if(choice == 0) {
           return new SgtPeppers();
       } else if(choice == 1) {
           return new WhiteAlbum();
       } else if(choice ==2) {
           return new HardDaysNight();
       } else {
           return new Resolver();
       }
    }

}
