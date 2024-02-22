package Opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,10,200,50,556);
        int result = sum(numbers);
        System.out.println("Summen: " + result);
    }

    public static int sum(List<Integer> list) {
        return sumHelper(list, 0);
    }

    public static int sumHelper(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else {
            return list.get(index) + sumHelper(list, index + 1);
        }
    }
}
