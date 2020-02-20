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

    public FancyCoffee(String name, Size size, Money basePrice) {
        super(name, size, basePrice);
        this.size = size;
    }

    public void add(Orderable o) {
        addOn.add(o);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public Money getPrice() {
        return this.getBasePrice();
    }

    @Override
    public String getReceiptItem() {
        StringBuilder x = new StringBuilder();
        x.append(this.size).append(" ").
                append(this.toString()).append(" ").
                append(this.getPrice()).append("\n");
        for (int i = 0; i < addOn.size(); i++) {

            x.append(addOn.get(i).getReceiptItem());

        }
        return x.toString();
    }
}
