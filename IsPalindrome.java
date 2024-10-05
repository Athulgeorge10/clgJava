import java.util.Scanner;

public class IsPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int l = str.length();
        for(int i=0; i<(l)/2; i++){
            if(str.charAt(i) != str.charAt(l-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }

}
