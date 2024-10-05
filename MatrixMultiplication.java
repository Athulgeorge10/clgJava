import java.util.Scanner;

public class MatrixMultiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter the number of rows and columns of the first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns of the second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if(c1 != r2){
            System.out.println("Matrices cannot be multiplied");
        }
        else{
            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            int[][] result = new int[r1][c2];
            System.out.println("Enter the elements of the first matrix: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    mat2[i][j] = sc.nextInt();
                }
            }
            System.out.println("The first matrix is:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(mat1[i][j] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("The second matrix is:");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    System.out.print(mat2[i][j] + "\t");
                }
                System.out.print("\n");
            }
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    result[i][j] = 0;
                    for(int k=0; k<c1; k++){
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
        
                }
            }
            System.out.println("The product of the two matrices is:");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    System.out.print(result[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}
