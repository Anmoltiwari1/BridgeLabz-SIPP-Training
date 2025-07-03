package Vehicle_Rental_System;
public class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 300;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance (Bike): Rs.300 | Policy: " + getInsurancePolicyNumber();
    }
}