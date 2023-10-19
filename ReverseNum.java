import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,t;
        System.out.print("Enter a number:\t");
        n=sc.nextInt();
        sc.close();
        t=n;
        while(t>0)
        {
            sum*=10;
            sum+=t%10;
            t/=10;
        }
        System.out.println("Reverse Number is "+sum);
    }
}