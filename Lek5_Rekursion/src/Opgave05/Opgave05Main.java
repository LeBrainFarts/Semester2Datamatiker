package Opgave05;

public class Opgave05Main {
    public static void main(String[] args)
    {
        int a = 10, b = 15, g;

        // Function call
        g = sfd(a, b);
        System.out.println("GCD(" + a + " , " + b
                + ") = " + g);

        a = 35;
        b = 10;
        g = sfd(a, b);
        System.out.println("GCD(" + a + " , " + b
                + ") = " + g);

        a = 31;
        b = 2;
        g = sfd(a, b);
        System.out.println("GCD(" + a + " , " + b
                + ") = " + g);
    }
    public static int sfd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return sfd(b % a, a);
    }
}
