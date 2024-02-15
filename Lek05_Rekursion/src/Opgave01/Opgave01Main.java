package Opgave01;

public class Opgave01Main {

    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println("Factorial Number of 5 is: " + ans);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
