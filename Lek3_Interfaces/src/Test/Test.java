package Test;

import Model.Customer;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer c1 = new Customer("Jonas", "Dyhr", 23);
        Customer c2 = new Customer("Ellen", "Moselund", 23);
        Customer c3 = new Customer("Jonas", "Dyhr", 18);
        Customer c4 = new Customer("Jonas", "Skjødt", 18);
        Customer c5 = new Customer("Ellen", "Moselund", 20);
        Customer c6 = new Customer("Ellen", "Dyhr",20);


        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        Collections.sort(customers);
        for (Customer cu : customers) {
            System.out.println(cu.getForNavn()+ " "+ cu.getEfterNavn()+ " "+ cu.getAlder());
        }
    }
}
