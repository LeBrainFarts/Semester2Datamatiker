package Opgave02.Model;

public class FixedDiscount extends Discount {
    private int discount;
    private int minimumAmount;

    public FixedDiscount(String description, int discount, int minimumAmount) {
        super(description);
        this.discount = discount;
        this.minimumAmount = minimumAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public int getMinimumAmount() {
        return minimumAmount;
    }

    @Override
    public double applyDiscount(Basket basket) {
        if (basket.getTotal() >= minimumAmount) {
            return -discount;
        } else {
            return 0;
        }
    }
}
