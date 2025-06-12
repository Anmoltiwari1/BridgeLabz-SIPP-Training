import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Harry's age in 2024 is " + age());
        System.out.println("Sam’s average mark in PCM is " + average() + "%");
        System.out.println("The distance 10.8 km in miles is " + kmToMiles(10.8));
        profitAndLoss();
        penDistribution();
        universityDiscountFixed();
        earthVolume();
        kmToMilesInput();
        universityDiscountInput();
        heightConversion();
        calculator();
        triangleArea();
        squareSide();
        feetToYardMile();
        totalPrice();
        handshakeCount();
    }

    public static int age() {
        return 2024 - 2000;
    }

    public static double average() {
        return (94 + 95 + 96) / 3.0;
    }

    public static double kmToMiles(double km) {
        return km / 1.6;
    }

    public static void profitAndLoss() {
        double cost = 129, selling = 191;
        double profit = selling - cost;
        double profitPercent = (profit / cost) * 100;
        System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + selling +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent + "%");
    }

    public static void penDistribution() {
        int totalPens = 14, students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }

    public static void universityDiscountFixed() {
        double fee = 125000, discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    public static void earthVolume() {
        double r = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }

    public static void kmToMilesInput() {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

    public static void universityDiscountInput() {
        Scanner input = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter student fee: ");
        fee = input.nextDouble();
        System.out.print("Enter discount percent: ");
        discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    public static void heightConversion() {
        Scanner input = new Scanner(System.in);
        double heightCm;
        System.out.print("Enter your height in cm: ");
        heightCm = input.nextDouble();
        double inches = heightCm / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int) feet + " and inches is " + (int)(inches % 12));
    }

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter number1: ");
        num1 = input.nextDouble();
        System.out.print("Enter number2: ");
        num2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 +
                " is " + (num1 + num2) + ", " + (num1 - num2) + ", " + (num1 * num2) + ", and " + (num1 / num2));
    }

    public static void triangleArea() {
        Scanner input = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base of triangle: ");
        base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = input.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // 1 sq inch = 6.4516 sq cm
        System.out.println("Area in square inches is " + areaInches + " and in square cm is " + areaCm);
    }

    public static void squareSide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    public static void feetToYardMile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Your distance in feet is " + feet + " which is " + yards + " yards and " + miles + " miles");
    }

    public static void totalPrice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }

    public static void handshakeCount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
