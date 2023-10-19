import java.util.Scanner;

public class GraterorLessNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number:\t");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number:\t");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd Number:\t");
        int num3=sc.nextInt();
        sc.close();
        System.out.println("Gratest Number  = "+(num1>num2?(num1>num3?num1:num3):num2>num3?num2:num3));
        System.out.println("Smallest Number = "+(num1<num2?(num1<num3?num1:num3):num2<num3?num2:num3));
    }
}