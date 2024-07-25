//Write a Java program to print the Fibonacci series up to a given number using a while loop.

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibn=0, a=0, b=1, n, i=2;
        System.out.print("Enter limit for Fibonacci Series: ");
        n = sc.nextInt();
        System.out.print("Fibonacci Series of " + n + ": 0 1 ");
        while(i<n){
            fibn = a + b;
            System.out.print(fibn + " ");
            a = b;
            b = fibn;
            i++;
        }
    }
}
