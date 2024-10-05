// Write a program to count the total no. of chars, words, lines, alphabets, digits,white spaces in a given string

import java.util.Scanner;

public class NoOfAlphaNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
        int chars=0, words=1, lines=0, alpha=0, digits=0, white=0;
        for (int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            if(a >= 'a' && a <= 'z'){
                alpha++;
                chars++;
            }
            if(a >= '0' && a <= '9'){
                digits++;
                chars++;
            }
            if(a == ' '){
                white++;
                words++;
            }
            if(a == '\n'){
                lines++;
            }
        }
        System.out.println("Total no. of chars: "+chars);
        System.out.println("Total no. of words: "+words);
        System.out.println("Total no. of lines: "+lines);
        System.out.println("Total no. of alphabets: "+alpha);
        System.out.println("Total no. of digits: "+digits);
        System.out.println("Total no. of white spaces: "+white);

    }    
}
