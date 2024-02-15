package Opgave04;

public class Opgave04Main {
    public static void main(String[] args) {
        String s = "Vinterferie";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        String ans;
        if (s == null || (s.length() <= 1)) {
            return s;
        } else {
            ans = "";
            System.out.println(s.charAt(s.length() - 1));
            ans = reverse(s.substring(0, s.length() - 1));
        }
        return ans;
    }
}
