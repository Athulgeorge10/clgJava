import java.util.Scanner;

public class StrBeginEndChars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (str.length() < 2) {
            System.out.println("The string should have at least two characters.");
        } else {
            String first = str.substring(0, 2);
            first = first.toLowerCase();
            String last = str.substring(str.length() - 2);
            last = last.toLowerCase();
            if (first.equals(last)) {
                System.out.println("The first two characters appear at the end of the string.");
            } else {
                System.out.println("The first two characters do not appear at the end of the string.");
            }
        }

    }
}