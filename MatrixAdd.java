//Create a program that performs matrix addition for two-dimensional arrays.

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter the number of rows and columns for the first matrix:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns for the second matrix:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if(r1 != r2 || c1 != c2){
            System.out.println("Matrix Addition is not possible!");
        }
        else{
            int[][] arr1 = new int[r1][c1];
            int[][] arr2 = new int[r2][c2];
            int[][] sum = new int[r1][c1];
            System.out.println("Enter the elements of the first matrix:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Sum of the two matrices:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
