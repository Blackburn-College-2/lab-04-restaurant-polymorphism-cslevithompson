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
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //creating initial instance of coffee
        /*size and money is created within the conditions */
        Coffee c = new Coffee(
                "Regular Coffee",
                new Size("medium"),
                new Money(11.0));

        /* creating a new receipt with a new coffee being added to it*/
        Receipt r = new Receipt();
        r.add(c);
        r.add(new Coffee("Cold Brew",
                new Size("small"),
                new Money(2.95)));
        r.add(new Coffee("Irish Coffee",
                new Size("large"),
                new Money(3.50)));
        r.add(new Coffee("Cortado",
                new Size("medium"),
                new Money(4.45)));
        r.add(new Coffee("Affogato",
                new Size("small"),
                new Money(7.88)));

        //creating fancycoffee
        FancyCoffee fC = new FancyCoffee("Cappuccino",
                new Size("medium"),
                new Money(2.50));
        //adding syrups to fancycoffee
        fC.add(new Syrup("Chocolate"));
        fC.add(new Syrup("Coffee"));
        fC.add(new Syrup("Pure Sugar"));

        //adding fancycoffee to receipt
        r.add(fC);

        //creating sandwich
        Sandwich s = new Sandwich("Normal Sandwich", new Money(3.0));
        //adding meat and topping to sandwich
        s.add(new Meat("Ham"));
        s.add(new Topping("Cheese"));
        
        //adding sandwich to receipt
        r.add(s);

        //printing receipt
        System.out.println(r.prepare());
        //printing total
        System.out.println("Total: " + r.getTotalPrice());
        

    }

    //estimated time: 5 hours
    //time taken: 3-4 hours
}
