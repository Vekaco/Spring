package ch2.lession2_2_4.config;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_1.cds.SgtPeppers;
import ch2.lession2_2_4.players.CDPlayer;
import ch2.lession2_2_4.players.MediaPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class, MediaPlayer.class, CompactDisc.class, SgtPeppers.class})
public class CDPlayerConfig {
}
