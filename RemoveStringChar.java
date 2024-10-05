// Write a Java program that remove a given character from String.

import java.util.Scanner;

public class RemoveStringChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to remove: ");
        char ch = sc.next().charAt(0);
        //str = str.replace(ch, "");
        while(str.indexOf(ch)>0){
            str = str.substring(0, str.indexOf(ch)) + str.substring(str.indexOf(ch)+1);
        }
        System.out.println("String after removing character: " + str);
    }
}