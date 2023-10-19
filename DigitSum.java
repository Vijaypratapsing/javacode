import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter Number:\t");
        n=sc.nextInt();
        int t=n;
        while(t>0)
        {
            sum+=t%10;
            t/=10;
        }
        System.out.println("Sum of digit:\t"+sum);
        sc.close();
    }
}
