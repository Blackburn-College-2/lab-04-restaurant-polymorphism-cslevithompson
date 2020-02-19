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
 public class Size extends Measurement{
    private String name;
    
    /* constructor for size that takes a name as args.*/
    public Size(String name) {
        //assigns the name attribute to the argument's name
        this.name = name;
    }

    //method that gets the name of the size
    public String getName() {
        return this.name;
    }
    
    /* overrides the toString method for Size
    so it prints the size's name */
    @Override
    public String toString() {
        return this.name;
    }
}
