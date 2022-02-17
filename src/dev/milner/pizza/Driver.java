package dev.milner.pizza;

public class Driver {

    public static void main(String[] args){

//      Pizza p = new Pizza(); //we cannot instantiate Shape if it's an abstract class
        Pizza p = new Pizza();
        System.out.println(p.size); // Strings begin with default type of null
        p.size = "medium";
        System.out.println(p.size);

        Pizza p1 = new Pizza();
        p1.setSize("medium");
        p1.setToppings("pineapple");
        System.out.println(p1); // automatically calls the .toString method

        Pizza p2 = new Pizza("large", "pepperoni");
        System.out.println(p2); // automatically calls the .toString method


    }

}
