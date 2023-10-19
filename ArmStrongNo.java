import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:\t");
        int num=sc.nextInt();
        sc.close();
        int power=0,temp=num,sum=0;
        while(temp>0)
        {
            power++;
            temp/=10;
        }
        temp=num;
        while(temp>0)
        {
            sum+=Math.pow(temp%10,power);
            temp/=10;
        }
        if(num==sum)
        System.out.println(num+" is a Armstrong number");
        else
        System.out.println(num+" is not a Armstrong number");
    }
}