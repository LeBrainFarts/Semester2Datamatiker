package Opgave02.Model;

public class ProcentDiscount extends Discount {
    private int procent;

    public ProcentDiscount(String description, int procent) {
        super(description);
        this.procent = procent;
    }

    public int getProcent() {
        return procent;
    }

    public int ProcentDiscount(int procent) {
        return 0;
    }

    @Override
    public double applyDiscount(Basket basket) {
        return -basket.getTotal() * procent / 100;
    }
}
