import java.util.Scanner;
public class PrimeSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,range;
        System.out.print("Enter range:\t");
        range=sc.nextInt();
        if(range>=2)
        {
            System.out.print("Prime Number:");
            System.out.print(" 2");
        }
        for(n=3;n<=range;n++)
        {
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                break;
            }
            if(i==n/2+1)
            System.out.print( " "+n);
        }
    }
}
