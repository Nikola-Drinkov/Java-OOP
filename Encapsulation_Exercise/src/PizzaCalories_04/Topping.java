package PizzaCalories_04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Topping {
    private String toppingType;
    private double weight;
    private static final Map<String, Double> toppings;
    static {
        toppings = new LinkedHashMap<>();
        toppings.put("Meat",1.2);
        toppings.put("Veggies", 0.8);
        toppings.put("Cheese", 1.1);
        toppings.put("Sauce", 0.9);
    }
    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if(!toppings.containsKey(toppingType)) throw new IllegalArgumentException("Cannot place "+toppingType+" on top of your pizza.");
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight<1||weight>50) throw new IllegalArgumentException(toppingType+" weight should be in the range [1..50].");
        this.weight = weight;
    }
    public double calculateCalories(){
        double currentTopping = toppings.get(toppingType);
        return (2*weight)*currentTopping;
    }
}
