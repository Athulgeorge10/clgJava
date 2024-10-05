//write a java program to generate an identity matrix of a given size.

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the matrix (n for an n x n matrix): ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("The identity matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
