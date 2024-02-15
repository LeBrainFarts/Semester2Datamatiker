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
        int numberOfPairs = books.size() / 2;

        double totalDiscount = 0;

            for (int i = 0; i < numberOfPairs * 2; i += 2) {
                Book firstBook = books.get(i);
                Book secondBook = books.get(i+1);

                double billigsteBogPris1 = firstBook.getPrice();
                double billigsteBogPris2 = secondBook.getPrice();

                totalDiscount += Math.min(billigsteBogPris1, billigsteBogPris2);
            }
        return -totalDiscount;
    }
}
