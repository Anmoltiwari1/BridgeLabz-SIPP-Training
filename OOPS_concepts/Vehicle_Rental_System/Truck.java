package Vehicle_Rental_System;
public class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return 2500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance (Truck): Rs.2500 | Policy: " + getInsurancePolicyNumber();
    }
}