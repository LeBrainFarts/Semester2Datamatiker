package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        intArray[row][column] = value;
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < intArray[row].length; i++) {
            sum += intArray[row][i];
        }
        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (j == column) {
                    sum += intArray[i][j];
                }
            }
        }
        return sum;
    }

    public int sumAll() {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum += intArray[i][j];
            }
        }
        return sum;
    }

    public void print() {
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[row].length; column++) {
                System.out.print(intArray[row][column] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum of each row:");
        for (int row = 0; row < intArray.length; row++) {
            int sum = sumRow(row);
            System.out.println("Row " + row + ": " + sum);
        }

        System.out.println("Sum of each column:");
        for (int column = 0; column < intArray[0].length; column++) {
            int sum = sumColumn(column);
            System.out.println("Column " + column + ": " + sum);
        }

        int totalSum = sumAll();
        System.out.println("Total sum: " + totalSum);
    }

    public void map(IntFunction function) {
    }


}
