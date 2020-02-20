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
public class Meat implements Orderable{

    private String name;
    
    //constructor for meat, with name as args. when creating
    public Meat(String name) {
        this.name = name;
        
    }
    
    //overrides getPrice to print meat's price
    @Override
    public Money getPrice() {
        return new Money(1.00);
    }

    //overrides getReceiptItem to print meat
    @Override
    public String getReceiptItem() {
        return "\t" + name + " " + this.getPrice() + "\n";
    }
    
}
