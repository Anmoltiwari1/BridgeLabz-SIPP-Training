// Interface for abstraction
interface Rentable {
    double calculateRent(int days);
}

// Abstract class for encapsulation & inheritance
abstract class Vehicle implements Rentable {
    protected String vehicleId;
    protected String brand;
    protected double baseRate;

    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleId() { return vehicleId; }
    public String getBrand() { return brand; }
    public double getBaseRate() { return baseRate; }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Base Rate: ₹" + baseRate);
    }
}

// Subclasses with polymorphic rent calculation
class Bike extends Vehicle {
    public Bike(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;  // No surcharge
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double insurance = 200;  // Fixed surcharge
        return baseRate * days + insurance;
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double maintenanceFee = 500;
        return baseRate * days + maintenanceFee;
    }
}

// Customer class
class Customer {
    private String customerId;
    private String name;
    private Vehicle rentedVehicle;
    private int rentalDays;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        this.rentedVehicle = vehicle;
        this.rentalDays = days;
        System.out.println("\nCustomer: " + name + " rented a " + vehicle.getClass().getSimpleName());
        vehicle.displayInfo();
        System.out.println("Days: " + days + ", Total Rent: ₹" + vehicle.calculateRent(days));
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create vehicles
        Bike bike = new Bike("B001", "Honda", 300);
        Car car = new Car("C001", "Toyota", 1000);
        Truck truck = new Truck("T001", "Tata", 2000);

        // Create customers
        Customer c1 = new Customer("CU101", "Anmol");
        Customer c2 = new Customer("CU102", "Priya");

        // Rent vehicles
        c1.rentVehicle(bike, 3);
        c2.rentVehicle(truck, 2);
    }
}
