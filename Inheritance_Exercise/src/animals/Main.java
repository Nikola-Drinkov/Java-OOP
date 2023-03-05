package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("Beast!")){
            try {
                Animal animal = null;
                String type = input;
                String[] info = sc.nextLine().split(" ");
                String name = info[0];
                int age = Integer.parseInt(info[1]);
                String gender = info[2];
                switch (type) {
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                }
                System.out.println(animal);
            }catch (Exception e){
                System.out.println("Invalid input!");
            }
            input = sc.nextLine();
        }
    }
}
