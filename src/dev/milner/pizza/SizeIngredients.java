package dev.milner.pizza;

public abstract class SizeIngredients {

    String size;
    String toppings;

    SizeIngredients(){
        super();//calling to the object class' no argument constructor
    }

    SizeIngredients(String sizeParam, String toppingsParam){
        super();
        this.size = sizeParam;
        this.toppings = toppingsParam;
    }


}
