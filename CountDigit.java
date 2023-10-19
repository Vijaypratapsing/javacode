import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter Number:\t");
        n=sc.nextInt();
        int t=n;
        while(t>0)
        {
            t/=10;
            count++;
        }
        System.out.println("Number of digit:\t"+count);
        sc.close();
    }
}
