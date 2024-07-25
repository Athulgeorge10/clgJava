//Write a Java program to print all prime numbers between 1 and 100 using a for loop and if-else statements

public class Prime100{
    public static void main(String[] args){
        int flag;
        System.out.println("Prime numbers between 1 and 100");
        for(int i=2; i<100; i++){
            flag = 1;
            for(int j=2; j<((i/2)+1); j++){
                if(i%j == 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }    
}
