import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number:\t");
        float a=sc.nextFloat();
        System.out.print("Enter 2nd number:\t");
        float b=sc.nextFloat();
        float c;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("\nSelect Option:\t");
        int n=sc.nextInt();
        switch(n){
            case 1:
            c=a+b;
            System.out.println("A + B = "+c);
            break;
            case 2:
            c=a-b;
            System.out.println("A - B = "+c);
            break;
            case 3:
            c=a*b;
            System.out.println("A X B = "+c);
            break;
            case 4:
            c=a/b;
            System.out.println("A / B = "+c);
            break;
            default:
            System.out.println("Invalid Selection");
        }
        sc.close();
    }
}
