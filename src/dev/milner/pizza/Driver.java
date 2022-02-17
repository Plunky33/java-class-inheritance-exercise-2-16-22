package dev.milner.pizza;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

//      Pizza p = new Pizza(); //we cannot instantiate Shape if it's an abstract class
//        Pizza p = new Pizza();
//        System.out.println(p.size); // Strings begin with default type of null
//        p.size = "medium";
//        System.out.println(p.size);
//
//        Pizza p1 = new Pizza();
//        p1.setSize("medium");
//        p1.setToppings("pineapple");
//        System.out.println(p1); // automatically calls the .toString method
//
//        Pizza p2 = new Pizza("large", "pepperoni");
//        System.out.println(p2); // automatically calls the .toString method

        Pizza p = new Pizza();
        Scanner scan = new Scanner(System.in);
        System.out.println("What size would you like for your pizza? small? medium? or large?");
        p.size = scan.next();

        System.out.println("How many topping would like on your pizza?");
        p.numToppings = scan.nextInt();

        System.out.println("What toppings would you like on your pizza?");
        String orderToppings = scan.next();
        orderToppings += scan.nextLine();
        p.toppings = orderToppings;


        System.out.println("Thank you, you have ordered a " + p.getSize() + " pizza, with " + p.getNumToppings() +" toppings: " + p.getToppings());

    }

}
