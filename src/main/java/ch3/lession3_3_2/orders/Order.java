package ch3.lession3_3_2.orders;


import ch3.lession3_3_2.dessert.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {
    private Dessert dessert;
    @Autowired
    @Qualifier("cake")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
