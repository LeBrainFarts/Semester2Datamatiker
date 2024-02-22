package Opgave02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1,0,0,2,0,1,0,2,0);
        int result = antal(numbersList);
        System.out.println("Hvor mange nuller? " + result);
    }

    public static int antal(List<Integer> list) {
        return antalHelper(list,0,list.size()-1);
    }

    public static int antalHelper(List<Integer> list, int low, int high) {
        if (low == high) {
            if (list.get(low) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int mid = (low + high) / 2;
            int leftMid = antalHelper(list, low, mid);
            int rightHigh = antalHelper(list, mid+1,high);
            return leftMid + rightHigh;
        }
    }
}
