package Opgave03;

import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        double[][] array = {
                {1.5, 2.3, 4.1},
                {5.6, 0.5, 3.2},
                {9.4, 7.8, 6.1}
        };


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row number:");
        int rows = scanner.nextInt();

        System.out.println("Enter the column number");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        int[] location = locateSmallest(matrix);
        System.out.println("The smallest element is at row " + location[0] + " and column " + location[1]);
    }

    public static int[] locateSmallest(double[][] a) {
        int minRow = 0;
        int minColumn = 0;
        double smallestNumber = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (a[row][column] < smallestNumber) {
                    smallestNumber = a[row][column];
                    minRow = row;
                    minColumn = column;
                }
            }
        }

        return new int[]{minRow,minColumn};
    }
}
