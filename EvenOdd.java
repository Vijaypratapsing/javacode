import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter Range");
        System.out.print("Initial:  ");
        i=sc.nextInt();
        System.out.print("Final:    ");
        j=sc.nextInt();
        sc.close();
        System.out.print("\nEven Numbers:\t");
        for(k=i;k<=j;k++)
        {
            if(k%2==0)
            System.out.print(k+" ");
        }
        System.out.print("\nOdd Numbers:\t");
        for(k=i;k<=j;k++)
        {
            if(k%2!=0)
            System.out.print(k+" ");
        }
    }
}
