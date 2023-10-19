import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year:\t");
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0)
        System.out.println(year+" is a Leap year");
        else if(year%400==0)
        System.out.println(year+" is a Leap year");
        else
        System.out.println(year+" is not a Leap year");
        sc.close();
    }
}
