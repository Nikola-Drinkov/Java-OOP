package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+1.6);
    }

    @Override
    public void drive(double distance) {
        if(fuelQuantity>distance*fuelConsumption){
            this.fuelQuantity-=distance*fuelConsumption;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Truck travelled "+df.format(distance)+" km");
        }
        else System.out.println("Truck needs refueling");
    }

    @Override
    public void refuel(double quantity) {
        this.fuelQuantity+=quantity*0.95;
    }
}
