import java.util.Scanner;
public class RotationR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:\t");
        int n=sc.nextInt();
        System.out.print("Enter value of rotation:\t");
        int r =sc.nextInt();
        int temp=n,count=0,i;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        temp=n;
        while(r>0)
        {
            i=temp%10;
            temp/=10;
            temp+=i*Math.pow(10, count-1);
            r--;
        }
        System.out.println("After Rotation:\t"+temp);
        sc.close();
    }
}