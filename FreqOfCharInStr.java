import java.util.Scanner;

public class FreqOfCharInStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        for (int s=0; s<str.length(); s++){
            if (str.charAt(s) == ch){
                count++;
            }
        }
        System.out.println("No. of occurence: " + count + "\n");

    }
}
                                    