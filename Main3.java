package com.java.lab2Java1;

class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0; 
    }

    public double calculateDistanceTraveled(double fuelConsumed) {
        return 0.0; 
    }

    public int getMaxSpeed() {
        return 0; 
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    
    public double calculateFuelEfficiency() {
        
        return 8.0; 
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        
        return fuelConsumed * calculateFuelEfficiency();
    }

   
    public int getMaxSpeed() {
        
        return 65; 
    }
}

class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String make, String model, int year, String fuelType, int passengerCapacity) {
        super(make, model, year, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    
    public double calculateFuelEfficiency() {
        
        return 30.0; 
    }

   
    public double calculateDistanceTraveled(double fuelConsumed) {
        
        return fuelConsumed * calculateFuelEfficiency();
    }

    
    public int getMaxSpeed() {
        
        return 120; 
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    
    public double calculateFuelEfficiency() {
        
        return 50.0; 
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        
        return fuelConsumed * calculateFuelEfficiency();
    }

    
    public int getMaxSpeed() {
        
        return 150; 
    }
}

public class Main3 {
    public static void main(String[] args) {
        
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline", 2000.0);
        Car car = new Car("Toyota", "Camry", 2023, "Gasoline", 5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Gasoline", false);

        System.out.println("Truck Details:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Load Capacity: " + truck.getLoadCapacity() + " pounds");
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
        System.out.println("Maximum Speed: " + truck.getMaxSpeed() + " MPH");

        System.out.println("\nCar Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Passenger Capacity: " + car.getPassengerCapacity() + " passengers");
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
        System.out.println("Maximum Speed: " + car.getMaxSpeed() + " MPH");

        System.out.println("\nMotorcycle Details:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Fuel Type: " + motorcycle.getFuelType());
        System.out.println("Has Sidecar: " + (motorcycle.hasSidecar() ? "Yes" : "No"));
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " MPG");
        System.out.println("Maximum Speed: " + motorcycle.getMaxSpeed() + " MPH");
    }
}

