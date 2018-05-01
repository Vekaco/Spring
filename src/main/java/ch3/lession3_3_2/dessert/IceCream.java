package ch3.lession3_3_2.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("iceCream")
public class IceCream implements Dessert {
}
