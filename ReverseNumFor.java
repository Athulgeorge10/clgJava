//Write a Java program to print the reverse of a given number using a for loop.

import java.util.Scanner;

public class ReverseNumFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, revNum = 0;
        System.out.print("Enter number to be reversed: ");
        num = sc.nextInt();
        for(int i = num; i>0;){
            revNum *= 10;
            revNum += i%10;
            i /= 10;
        }
        System.out.println("Reversed number: " + revNum);
    }
}
