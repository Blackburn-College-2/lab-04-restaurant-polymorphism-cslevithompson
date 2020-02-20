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
public class Syrup implements Orderable{

    private String flavor;
    
    //constructor for syrup, with flavor as args. when creating
    public Syrup(String flavor) {
        this.flavor = flavor;
        
    }
    
    //overrides getPrice to print syrup's price
    @Override
    public Money getPrice() {
        return new Money(0.50);
    }

    //overrides getReceiptItem to print syrup
    @Override
    public String getReceiptItem() {
        return "\t" + flavor + " " + this.getPrice() + "\n";
    }
    
}
