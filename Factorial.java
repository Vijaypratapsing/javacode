import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,fact=1;
        System.out.print("Enter Number:\t");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}