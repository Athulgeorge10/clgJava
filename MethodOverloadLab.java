import java.util.Scanner;

public class MethodOverloadLab{
    public float Area(float a, float b){
        return (a*b) / 2;
    }
    public int Area(int a, int b){
        return a*b;
    }
    public float Area(float a){
        return 3.14f * a * a;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverloadLab obj = new MethodOverloadLab();
        float tb, th, cr;
        int rw, rh;
        System.out.print("Enter the Base of the triangle: ");
        tb = sc.nextFloat();
        System.out.print("Enter the Height of the triangle: ");
        th = sc.nextFloat();
        System.out.print("Enter the Width of the rectangle: ");
        rw = sc.nextInt();
        System.out.print("Enter the Height of the rectangle: ");
        rh = sc.nextInt();
        System.out.print("Enter the Radius of the circle: ");
        cr = sc.nextFloat();
        float AT = obj.Area(tb, th);
        System.out.println("Area of Triangle with base: " + tb +" and height: " + th + " is: " + AT);
        int AR = obj.Area(rw,rh);
        System.out.println("Area of Rectangle with width: " + rw + " and length: " + rh + " is: " + AR);
        float AC = obj.Area(cr);
        System.out.println("Area of Circle with radius: " + cr + " is: " + AC);
    }    
}
