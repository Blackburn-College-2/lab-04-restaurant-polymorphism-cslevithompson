/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab04;

import edu.blackburn.cs.cs212.restaurantbase.*;
import java.util.ArrayList;

/**
 *
 * @author levi.thompson
 */
public class FancyCoffee extends Coffee {

    private ArrayList<Orderable> addOn = new ArrayList();
    private Size size;

    /*constructor for FancyCoffee; with name, size, and
    baseprice as args. when creating*/
    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);
        this.size = size;
    }

    //method to add items to addOn's arraylist
    public void add(Orderable o) {
        addOn.add(o);
    }

    //overrides getPrice to print FancyCoffee's name
    @Override
    public String toString() {
        return this.getName();
    }

    //overrides getPrice to print FancyCoffee's price
    @Override
    public Money getPrice() {
        return this.getBasePrice();
    }

    //overrides getReceiptItem to print FancyCoffee
    @Override
    public String getReceiptItem() {
        //string builder to help with printing
        StringBuilder x = new StringBuilder();
        x.append(this.size).append(" ").
                
            append(this.toString()).append(" ").
                
            append(this.getPrice()).append("\n");
        /*for loop to add contents to the list and print from contents
        at the index of i */
        for (int i = 0; i < addOn.size(); i++) {

            x.append(addOn.get(i).getReceiptItem());

        }
        return x.toString();
    }
}
