public class SumofNatural{
    public static void main(String[] args) {
        int n = 1,sum=0;
        do{
            sum+=n;
            n++;
        }while(n<=100);
        System.out.println("Sum of first 100 natural numbers ="+sum);
    }
}