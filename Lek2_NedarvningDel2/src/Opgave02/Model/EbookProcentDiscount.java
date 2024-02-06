package Opgave02.Model;

public class EbookProcentDiscount extends Discount {
    private double procent;

    public EbookProcentDiscount(String description, double procent) {
        super(description);
        this.procent = procent;
    }

    @Override
    public double applyDiscount(Basket basket) {
        double discount = 0;
        for (Book item : basket.getItems()) {
            if (item instanceof Ebook) {
                discount -= item.getPrice() * procent / 100;
            }
        }
        return discount;
    }
}
