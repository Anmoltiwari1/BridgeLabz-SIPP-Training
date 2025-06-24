//Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius of 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}