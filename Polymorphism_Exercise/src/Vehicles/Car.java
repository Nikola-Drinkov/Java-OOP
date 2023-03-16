package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+0.9);
    }

    @Override
    public void drive(double distance) {
        if(fuelQuantity>distance*fuelConsumption){
            this.fuelQuantity-=distance*fuelConsumption;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Car travelled "+df.format(distance)+" km");
        }
        else System.out.println("Car needs refueling");
    }

    @Override
    public void refuel(double quantity) {
        this.fuelQuantity+=quantity;
    }
}
