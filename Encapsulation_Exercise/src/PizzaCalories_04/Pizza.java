package PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }
    private void setToppings(int toppings) {
        if(toppings<0||toppings>10) throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        this.toppings = new ArrayList<>(toppings);
    }
    private void setName(String name) {
        if(name==null||name.trim().isEmpty()||name.length()>15) throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        this.name = name;
    }
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping topping){
        toppings.add(topping);
    }
    public double getOverallCalories(){
        double sum = 0;
        sum+=dough.calculateCalories();
        for(Topping topping:toppings){
            sum+=topping.calculateCalories();
        }
        return sum;
    }
}
