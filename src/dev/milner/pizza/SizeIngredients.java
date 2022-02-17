package dev.milner.pizza;

public abstract class SizeIngredients {

    String size;
    String toppings;
    int numToppings;

    SizeIngredients(){
        super();//calling to the object class' no argument constructor
    }

    SizeIngredients(String sizeParam, String toppingsParam, int numToppingsParam){
        super();
        this.size = sizeParam;
        this.toppings = toppingsParam;
        this.numToppings = numToppingsParam;
    }


}
