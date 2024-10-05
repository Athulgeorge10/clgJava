//Write a Java program that finds the maximum element in each row of a given 2D matrix and returns the results in a separate array.

import java.util.Scanner;

public class RowMax2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows in the matrix: ");
        r = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int[] rowMax = new int[r];
        for(int i=0; i<r; i++){
            int max = matrix[i][0];
            for(int j=0; j<c; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            rowMax[i] = max;
        }
        System.out.println("Maximum element in each row: ");
        for(int i=0; i<r; i++){
            System.out.println("Row "+(i+1)+": "+rowMax[i]);
        }
    }
}