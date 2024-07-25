//Write a Java program to check if a given year is a leap year or not using if-else statements.

import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr;
        System.out.print("Enter a year(YYYY): ");
        yr = sc.nextInt();
        if((yr%4 == 0 && yr%100 != 0) || yr%400 == 0){
            System.out.println(yr + " is a Leap Year.");
        }
        else{
            System.out.println(yr + " is not a Leap Year.");
        }
    }    
}
