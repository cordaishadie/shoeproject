package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class ShoeProject {
    public static void main(String[] args) {
        // create an ArrayList of Shoe objects
        ArrayList<Shoe> shoeCollection = new ArrayList<Shoe>();

        // instantiate a new Sneaker object
        Sneaker sneaker1 = new Sneaker("Nike", "Black", 10.5, "Leather", 2,
                1, true, "Lace", "Rubber", "Running");
        // add sneaker1 to shoeCollection
        shoeCollection.add(sneaker1);

        // instantiate a new Boot object
        Boot boot1 = new Boot("UGG", "Brown", 8, "Suede", 0, 0,
                false, true, true);
        // add boot1 to an array of shoes
        shoeCollection.add(boot1);

        // instantiate a new Sandal object
        Sandal sandal1 = new Sandal("Birkenstock", "Brown", 8, "Leather", 2,
                0, false, "Thong", false, "Wedge");
        // add sandal1 to an array of shoes
        shoeCollection.add(sandal1);

        // 3 more random shoes
        // instantiate a new Sneaker object
        Sneaker sneaker2 = new Sneaker();
        Sandal sandal2 = new Sandal();
        Boot boot2 = new Boot();

        // add the new shoes to the shoeCollection array
        shoeCollection.add(sneaker2);
        shoeCollection.add(sandal2);
        shoeCollection.add(boot2);

        // print out the shoeCollection array
        System.out.println("\nThe shoeCollection array is: \n");
        for (int i = 0; i < shoeCollection.size(); i++) {
            System.out.println(shoeCollection.get(i).toString());
        }

        // print out the value of sneaker2 using the toString() method
        System.out.println("\nThe value of sneaker2 is: \n" + sneaker2.toString());
        
        // calculate the price of sneaker1
        double price = sneaker1.pricing();
        // print the price of sneaker1
        System.out.println("\nThe price of sneaker1 is: $" + price + " dollars.");

        

        //  *sort the shoeCollection array using the compareTo() method*
        System.out.println("\nSorting the shoeCollection array using the compareTo() method...");
        // sort the shoeCollection array using the compareTo() method
        for (int i = 0; i < shoeCollection.size(); i++) {
            for (int j = i + 1; j < shoeCollection.size(); j++) {
                if (shoeCollection.get(i).compareTo(shoeCollection.get(j)) > 0) {
                    Shoe temp = shoeCollection.get(i);
                    shoeCollection.set(i, shoeCollection.get(j));
                    shoeCollection.set(j, temp);
                }
            }
        }
        // print out the shoeCollection array
        System.out.println("The sorted shoeCollection array is: \n");
        for (int i = 0; i < shoeCollection.size(); i++) {
            System.out.println(shoeCollection.get(i).toString());
        } 


        

    }
}
