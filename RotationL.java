import java.util.Scanner;
public class RotationL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:\t");
        int n=sc.nextInt();
        System.out.print("Enter value of rotation:\t");
        int r =sc.nextInt();
        int temp=n,count=0,i,p;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        temp=n;
        p=(int) (Math.pow(10,count-1));
        while(r>0)
        {
            i=temp%p;
            temp/=p;
            temp+=i*10;
            r--;
        }
        System.out.println(temp);
        sc.close();
    }
}