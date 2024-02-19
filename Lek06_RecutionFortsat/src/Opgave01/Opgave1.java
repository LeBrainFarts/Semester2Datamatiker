package Opgave01;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(list);
        //   System.out.println("ligetal: " + ligeTal(list));
        System.out.println("ligetal: " + ligeTal2(list, 0));
        System.out.println(list);
    }

    public static int ligeTal(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else if (list.getFirst() % 2 == 0) {
            list.removeFirst();
            return ligeTal(list) + 1;
        }
        list.removeFirst();
        return ligeTal(list);
    }

    public static int ligeTal2(ArrayList<Integer> list, int index) {
        if (list.size() == index) {
            return 0;
        }
        if (list.getFirst() % 2 == 0) {
            index++;
            return 1 + ligeTal2(list, index);
        } else {
            index++;
            return ligeTal2(list, index);
        }
    }


}
