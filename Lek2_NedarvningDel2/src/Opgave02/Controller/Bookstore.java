package Opgave02.Controller;

import Opgave02.Model.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        //-----------Fixed Discounts-----------//
//        Discount fixedDiscount = new FixedDiscount("Fixed Discount", 50, 10);
//        basket.addDiscount(fixedDiscount);
        //-----------Procent Discount-----------//
//        Discount procentDiscount = new ProcentDiscount("Procent Discount", 25);
//        basket.addDiscount(procentDiscount);
        //-----------Procent Discount-----------//
        Discount twoForOneDiscount = new TwoForOneDiscount("TwoForOne Discount");
        basket.addDiscount(twoForOneDiscount);


        basket.printTotal();
    }
}
