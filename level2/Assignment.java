import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        basicCalculator(sc);
        triangleArea(sc);
        squareSide(sc);
        feetToYardsMiles(sc);
        totalPurchase(sc);
        quotientAndRemainder(sc);
        intOperations(sc);
        doubleOperations(sc);
    }

    public static void basicCalculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num2 != 0 ? num1 / num2 : Double.NaN;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }

    public static void triangleArea(Scanner sc) {
        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and sq in is " + areaInches);
    }

    public static void squareSide(Scanner sc) {
        System.out.print("Enter perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    public static void feetToYardsMiles(Scanner sc) {
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }

    public static void totalPurchase(Scanner sc) {
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }

    public static void quotientAndRemainder(Scanner sc) {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two numbers " + num1 + " and " + num2);
    }

    public static void intOperations(Scanner sc) {
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();
        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;
        System.out.println("The results of Int Operations are: a + b * c = " + op1 +
                ", a * b + c = " + op2 +
                ", c + a / b = " + op3 +
                ", a % b + c = " + op4);
    }

    public static void doubleOperations(Scanner sc) {
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
        System.out.println("The results of Double Operations are: a + b * c = " + op1 +
                ", a * b + c = " + op2 +
                ", c + a / b = " + op3 +
                ", a % b + c = " + op4);
    }
}
