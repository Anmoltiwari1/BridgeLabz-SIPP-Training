public class CollinearityChecker {

    // Method to calculate slope between two points
    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY; // Handle division by zero
        }
        return (double) (y2 - y1) / (x2 - x1);
    }

    // Method to check if points are collinear
    public static boolean arePointsCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Using a small threshold to handle floating-point precision
        return Math.abs(slopeAB - slopeBC) < 1e-6 &&
               Math.abs(slopeAB - slopeAC) < 1e-6;
    }

    // Main method
    public static void main(String[] args) {
        // Sample input
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        boolean result = arePointsCollinear(x1, y1, x2, y2, x3, y3);

        System.out.println("Points A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
        if (result) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}
