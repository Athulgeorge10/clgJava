//Write a Java program to calculate the sum of all elements in an integer array.

import java.util.Scanner;

public class SumOfIntArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,sum = 0;
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the array is: "+sum);
    }
}
