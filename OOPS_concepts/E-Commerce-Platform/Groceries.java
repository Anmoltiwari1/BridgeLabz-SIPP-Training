public class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public double calculateTax() {
        return 0;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Exempt";
    }
}
