import java.util.Scanner;

public class AreaofCircle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle:\t");
        float r=sc.nextFloat();
        sc.close();
        double area=(r*r*3.14159);
        System.out.println("Area of Circle = "+area);
    }
}