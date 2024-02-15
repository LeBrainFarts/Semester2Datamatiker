package Opgave03;

public class Opgave03Main {
    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }

        return n * power(n, p -1);
    }
    public static void main(String[] args)
    {
        int N = 2;
        int P = 3;

        System.out.println(power(N, P));
    }
}
