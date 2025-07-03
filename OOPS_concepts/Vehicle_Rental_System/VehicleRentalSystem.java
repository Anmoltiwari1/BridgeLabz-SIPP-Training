package Vehicle_Rental_System;
import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("MH12AB1234", 1200, "CAR1001"));
        fleet.add(new Bike("MH14CD5678", 400, "BIKE2002"));
        fleet.add(new Truck("MH16EF9012", 2000, "TRUCK3003"));

        int rentalDays = 3;

        System.out.println("=== Vehicle Rental Details for " + rentalDays + " days ===");
        for (Vehicle v : fleet) {
            v.displayVehicleDetails(rentalDays);
            System.out.println("---------------------------");
        }
    }
}
