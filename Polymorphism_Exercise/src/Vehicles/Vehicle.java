package Vehicles;

public abstract class Vehicle{
    double fuelQuantity;
    double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double quantity);
}
