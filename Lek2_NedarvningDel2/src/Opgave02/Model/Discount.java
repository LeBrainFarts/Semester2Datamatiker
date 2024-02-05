package Opgave02.Model;

public abstract class Discount {
    private String description;

    public Discount(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public abstract double applyDiscount(Basket basket);
}
