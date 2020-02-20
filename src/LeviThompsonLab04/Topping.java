/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab04;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author levi.thompson
 */
public class Topping implements Orderable{

    private String type;
    
    //constructor for topping, taking type as args. when creating
    public Topping(String type) {
        this.type = type;
    }
    
    //overrides getPrice to print topping's price
    @Override
    public Money getPrice() {
        return new Money(0.50);
    }

    //overrides getReceiptItem to print topping
    @Override
    public String getReceiptItem() {
        return "\t" + type + " " + this.getPrice() + "\n";
    }
    
}
