package Opgave02;

public class Opgave02Main {
    public static void main(String[] args) {
        int j = 10;
        for (int i = 0; i < j; i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
