package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Citizen> citizens = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equals("End")){
            String[] inputParts = input.split(" ");
            String type = inputParts[0];
            switch (type){
                case"Citizen":
                    String name = inputParts[1];
                    int age = Integer.parseInt(inputParts[2]);
                    String id = inputParts[3];
                    String birthdate = inputParts[4];
                    Citizen citizen = new Citizen(name,age,id,birthdate);
                    citizens.add(citizen);
                    break;
                case"Pet":
                    String namePet = inputParts[1];
                    String birthdatePet = inputParts[2];
                    Pet pet = new Pet(namePet,birthdatePet);
                    pets.add(pet);
                    break;
            }
            input = sc.nextLine();
        }
        String year = sc.nextLine();
        for(Citizen citizen:citizens){
            if(citizen.getBirthDate().contains(year))
                System.out.println(citizen.getBirthDate());
        }
        for(Pet pet:pets){
            if(pet.getBirthDate().contains(year))
                System.out.println(pet.getBirthDate());
        }
    }
}
