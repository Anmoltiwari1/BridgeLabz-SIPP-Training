public class IceCreamRush {
    static void bubbleSort(String[] flavors, int[] sales) {
        int n = sales.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] < sales[j + 1]) {
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;

                    String tempStr = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempStr;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mango", "Pineapple", "Butterscotch", "Coffee", "Black Currant"};
        int[] sales = {120, 200, 90, 150, 70, 160, 130, 110};

        bubbleSort(flavors, sales);

        for (int i = 0; i < flavors.length; i++) {
            System.out.println(flavors[i] + ": " + sales[i]);
        }
    }
}
