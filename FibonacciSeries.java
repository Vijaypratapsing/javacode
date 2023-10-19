import java.util.Scanner;
public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,n1=0,n2=1,range;
    System.out.print("Enter range:\t");
    range=sc.nextInt();
    sc.close();
    for(i=0;i<=range;i++)
    {
        System.out.print(n1+" ");
        n2=n1+n2;
        n1=n2-n1;
    }
  }  
}
