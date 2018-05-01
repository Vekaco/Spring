package ch2.lession2_2_1.configs;

import ch2.lession2_2_1.cds.CompactDisc;
import ch2.lession2_2_1.cds.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "ch2.lession2_2_1")
//@ComponentScan("ch2.lession2_2_1")
@ComponentScan(basePackageClasses = {CompactDisc.class, SgtPeppers.class})
public class CDPlayerConfig {

}
