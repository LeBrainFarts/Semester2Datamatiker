package Opgave02.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class TwoForOneDiscount extends Discount{
    public TwoForOneDiscount(String description) {
        super(description);
    }

    @Override
    public double applyDiscount(Basket basket) {
        ArrayList<Book> books = basket.getItems();
        Book billigsteBog = books.getFirst();
        if (books.size() == 2) {
            for (int i = 1; i < books.size(); i++) {
                if (books.get(i).getPrice() < billigsteBog.getPrice()) {
                    billigsteBog = books.get(i);
                }
            }
        }
        return -billigsteBog.getPrice();
    }
}
