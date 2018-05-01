package ch3.lession3_3_2.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cookies")
public class Cookies implements Dessert {
}
