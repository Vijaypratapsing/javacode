import java.util.Scanner;
public class WeekdayorWeekend{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("1.Sunday");
        System.out.println("2.Monday");
        System.out.println("3.Tuesday");
        System.out.println("4.Wednesday");
        System.out.println("5.Thursday");
        System.out.println("6.Friday");
        System.out.println("7.Saturday");
        System.out.print("\nSelect Day:\t");
        n=sc.nextInt();
        sc.close();
        switch(n)
        {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            System.out.println("This is Weekday");
            break;
            case 1:
            case 7:
            System.out.println("This is a Weekend");
            break;
            default:
            System.out.println("Invalid Selection");
        }
    }
}