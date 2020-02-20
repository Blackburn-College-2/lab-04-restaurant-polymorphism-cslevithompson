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
public class Sandwich implements Orderable {

    private ArrayList<Orderable> contents = new ArrayList();
    private String name;
    private Money basePrice;

    /*constructor for sandwich, with name and 
    baseprice as args. when creating*/
    public Sandwich(String name, Money basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    //method to add items to contents's arraylist
    public void add(Orderable o) {
        contents.add(o);
    }

    //overrides getPrice to print sandwich's price
    @Override
    public Money getPrice() {
        return this.basePrice;
    }

    //overrides getReceiptItem to print sandwich
    @Override
    public String getReceiptItem() {
        //string builder to help with printing
        StringBuilder x = new StringBuilder();
            
            x.append(this.name).append(" ").
            
            append(this.getPrice()).append("\n");
        /*for loop to add contents to the list and print from contents
        at the index of i */
        for (int i = 0; i < contents.size(); i++) {

            x.append(contents.get(i).getReceiptItem());

        }
        return x.toString();
    }

}
