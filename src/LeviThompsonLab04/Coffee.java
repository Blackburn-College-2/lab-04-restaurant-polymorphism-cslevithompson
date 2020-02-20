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
public class Coffee extends MenuItem {

    private Size size;
    
    
    /*constructor for coffee that takes a name size and
    basePrice as args. */
    public Coffee(String name, Size size, Money basePrice) {
        //calls the parent constructor
        super(name, basePrice);
        this.size = size;
    }
    
    //overrides the toString method of Coffee to print the name
    @Override
    public String toString() {
        return this.getName();
    }

    //overrides the getPrice method to return the base price
    @Override
    public Money getPrice() {
        return this.getBasePrice();
    }

    /*overrides the getReceiptItem method to return the combo 
    of toString and getPrice */
    @Override
    public String getReceiptItem() {
        return this.size.toString() + " " 
                + this.toString() + " " 
                + this.getPrice() 
                + "\n";
    }
    
}
