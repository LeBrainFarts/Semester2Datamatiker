package Opgave02;

import opgave01.models.TwoDimensionalIntArray;

import java.util.Scanner;

public class Opgave02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialisere listen til at være 4 by 4
        double[][] matrix = new double[4][4];

        //læser hvad man skriver ind i den 4 by 4 liste
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = scanner.nextDouble();
            }
        }

        // Calculate and display the average of the major diagonal
        double average = averageMajorDiagonal(matrix);
        System.out.println("Average of the elements in the major diagonal is " + average);

        scanner.close();
    }

    private static double[][] m;

    public void TwoDimensionallArray(double[][] m) {
        this.m = m;
    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    public static void print() {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
