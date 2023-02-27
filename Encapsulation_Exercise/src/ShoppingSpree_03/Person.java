package ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.isEmpty()||name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0) throw new IllegalArgumentException("Money cannot be negative");
        this.money = money;
    }
    public void buyProduct(Product product){
        if(money>=product.getCost()){
            money-=product.getCost();
            products.add(product);
            System.out.println(name+" bought "+product.getName());
        }
        else throw new IllegalStateException(name+" can't afford "+product.getName());
    }
    public String getName(){
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
