//Write a java program to multiply each element of a matrix by a scalar value. Also display the resultant matrix after multiplication.

import java.util.Scanner;

public class ScalarMultiplyMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r, c, scalar;
        System.out.println("Enter the number of rows in the 2D matrix: ");
        r = sc.nextInt();
        System.out.println("Enter the number of columns in the 2D matrix: ");
        c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Enter the scalar value to multiply with the matrix: ");
        scalar = sc.nextInt();
        int[][] result = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        System.out.println("The resulting matrix after scalar multiplication is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
