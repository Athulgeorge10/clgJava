// Write a Java program to read a given string and return the string without the first or last characters if they are the same, otherwise return the string without the characters.

import java.util.Scanner;

public class FirstLastChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println();
        if(str.length() < 2 ){
            System.out.println("String should have atleast 3 characters!");
        }
        else if(Character.toLowerCase(str.charAt(0)) != Character.toLowerCase(str.charAt(str.length()-1))){
            System.out.println("The first and last characters are different and have been removed.");
            System.out.println(str.substring(1, str.length()-1));
        }
        else{
            System.out.println("The first and last characters are same and have been removed.");
            System.out.println(str.substring(1, str.length()-1));
        }
    }
}
