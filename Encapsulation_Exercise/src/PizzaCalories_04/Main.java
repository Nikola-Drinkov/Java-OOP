package PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza;
            String[] pizzaArr = sc.nextLine().split(" ");
            String pizzaName = pizzaArr[1];
            int countToppings = Integer.parseInt(pizzaArr[2]);
            pizza = new Pizza(pizzaName,countToppings);

            String[] doughArr = sc.nextLine().split(" ");
            String flourType = doughArr[1];
            String bakingTech = doughArr[2];
            int weightInGrams = Integer.parseInt(doughArr[3]);
            Dough dough = new Dough(flourType,bakingTech,weightInGrams);
            pizza.setDough(dough);

            String input = sc.nextLine();
        while (!input.equals("END")){
            String[] toppingArr = input.split(" ");
            String toppingType = toppingArr[1];
            int weightTop = Integer.parseInt(toppingArr[2]);
            Topping topping = new Topping(toppingType,weightTop);
            pizza.addTopping(topping);

            input = sc.nextLine();
        }
        System.out.printf("%s - %.2f%n",pizza.getName(),pizza.getOverallCalories());
    }
}
