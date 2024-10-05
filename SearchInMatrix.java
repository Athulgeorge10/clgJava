//Write a java program to search for a specific element in a two-dimensional array and return its position.

import java.util.Scanner;

public class SearchInMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,target,tr= 0,tc = 0,found = 0;
        System.out.println("Enter no of rows and columns in array: ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }    
        }
        System.out.println("Enter element to search: ");
        target = sc.nextInt();
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(arr[i][j] == target){
                    tr = i+1;
                    tc = j+1;
                    found = 1;
                    break;
                }
            }
            if(found == 1){
                break;
            }
        }
        if(found != -1){
            System.out.println("Element found at position (" + tr + ", " + tc + ")");
        } 
        else{
            System.out.println("Element not found in the array");
        }
    }
}
