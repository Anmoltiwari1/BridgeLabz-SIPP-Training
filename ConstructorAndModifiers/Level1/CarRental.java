public class CarRental{
    String coustomerName;
    String carType;
    int rentalDays;

    public CarRental() {
        this.coustomerName = "Unknown Customer";
        this.carType = "Standard";
        this.rentalDays = 1; // Default rental days
    }

    public CarRental(String coustomerName, String carType, int rentalDays) {
        this.coustomerName = coustomerName;
        this.carType = carType;
        this.rentalDays = rentalDays;
    }
}