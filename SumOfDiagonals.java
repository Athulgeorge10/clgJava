//Write a java program to calculate the sum of both diagonals of a square matrix.

import java.util.Scanner;

public class SumOfDiagonals{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumD1 = 0, sumD2 = 0;
        System.out.print("Enter the number of rows and columns of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            sumD1 += matrix[i][i];
            sumD2 += matrix[i][n-i-1];
        }
        System.out.println("Sum of the first diagonal: "+sumD1);
        System.out.println("Sum of the second diagonal: "+sumD2);
    }
}
