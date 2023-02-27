package ShoppingSpree_03;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> peopleMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsMap = new LinkedHashMap<>();
        String[] peopleStringArr = sc.nextLine().split(";");
        for(String person:peopleStringArr){
            String name = person.split("=")[0];
            String money = person.split("=")[1];
            peopleMap.put(name,Integer.parseInt(money));
        }
        String[] productsStringArr = sc.nextLine().split(";");
        for(String product:productsStringArr){
            String name = product.split("=")[0];
            String price = product.split("=")[1];
            productsMap.put(name,Integer.parseInt(price));
        }
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : peopleMap.entrySet()) {
            Person person = new Person(entry.getKey(), entry.getValue());
            people.add(person);
        }
        for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
            Product product = new Product(entry.getKey(),entry.getValue());
            products.add(product);
        }

        String input = sc.nextLine();
        while (!input.equals("END")){
            String personStr = input.split(" ")[0];
            String productStr = input.split(" ")[1];
            Person currentPerson = null;
            Product currentProduct = null;
            for(Person person:people){
                if (person.getName().equals(personStr))
                    currentPerson = person;
            }
            for(Product product:products){
                if(product.getName().equals(productStr))
                    currentProduct = product;
            }
            currentPerson.buyProduct(currentProduct);
            input = sc.nextLine();
        }
        for (Person person:people){
            List<Product> bag = person.getProducts();
            if (bag.isEmpty()){
                System.out.printf("%s - Nothing bought%n",person.getName());
            }
            else{
                System.out.print(person.getName()+" - ");
                for(int i=0; i<bag.size(); i++){
                    if(i<bag.size()-1) System.out.print(bag.get(i).getName()+", ");
                    else System.out.println(bag.get(i).getName());
                }
            }
        }
    }
}
