package Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] firstLine = sc.nextLine().split(" ");
        double fuelCar = Double.parseDouble(firstLine[1]);
        double litersCar = Double.parseDouble(firstLine[2]);
        Car car = new Car(fuelCar,litersCar);

        String [] secondLine = sc.nextLine().split(" ");
        double fuelTruck = Double.parseDouble(secondLine[1]);
        double litersTruck = Double.parseDouble(secondLine[2]);
        Truck truck = new Truck(fuelTruck,litersTruck);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            String command = input[0];
            String vehicle = input[1];
            double value = Double.parseDouble(input[2]);
            if(command.equals("Drive")){
                if(vehicle.equals("Car")){
                    car.drive(value);
                }
                else truck.drive(value);
            }
            else{
                if(vehicle.equals("Car")){
                    car.refuel(value);
                }
                else truck.refuel(value);
            }
        }

        System.out.printf("Car: %.2f%n",car.fuelQuantity);
        System.out.printf("Truck: %.2f%n",truck.fuelQuantity);

    }
}
