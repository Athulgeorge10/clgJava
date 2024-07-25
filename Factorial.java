//Write a Java program to print the factorial of a given number using a while loop.

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter a number to find factorial: ");
        num = sc.nextInt();
        while(num>0){
            fact *= num;
            num--;
        }
        System.out.println("Factorial = " + fact);
    }
}