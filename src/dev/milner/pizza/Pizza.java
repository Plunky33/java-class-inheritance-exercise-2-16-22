package dev.milner.pizza;

public class Pizza extends SizeIngredients {

    // instance variables are provided default values (0, 0.0, false, null)
//    private double radius;

    // implicitly provides a no argument constructor
    public Pizza(){
        super();
    }

    Pizza(String size, String toppings){
        super();
        this.size = size;
        this.toppings = toppings;
//        super(pizzaSizeParam, pizzaToppingsParam);
    }

    public String getSize(){
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings(){
        return this.toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    /*
        Another example of polymorphism, method overriding (runtime polymorphism)
     */
    @Override
    public String toString(){
        return "This is a "+ getSize() + " pizza, with the following toppings: "+ getToppings();
    }

}

