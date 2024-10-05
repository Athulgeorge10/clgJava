//Write a java program to check if a given matrix is symmetric in Java.

import java.util.Scanner;

public class MatrixSymmetricCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, isSymmetric = 1;
        System.out.println("Enter the size of the square matrix (n for an n x n matrix): ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = 0;
                }
            }
        }
        if(isSymmetric == 1){
            System.out.println("The matrix is symmetric.");
        }
        else{
            System.out.println("The matrix is not symmetric.");
        }
    }
}
