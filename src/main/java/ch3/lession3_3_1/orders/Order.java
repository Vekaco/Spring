package ch3.lession3_3_1.orders;


import ch3.lession3_3_1.dessert.Dessert;
import org.springframework.beans.factory.annotation.Autowired;

public class Order {
    private Dessert dessert;
    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
