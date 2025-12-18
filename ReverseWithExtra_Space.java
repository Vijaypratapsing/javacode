import java.util.Scanner;
public class ReverseWithExtra_Space {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }int[] b;
       b = new int[n];
        for (int j=0;j<n;j++){
             b[j]=a[n-1-j];
        }
        System.out.println("reverse array is");
        for(int i=0;i<n;i++){
            System.out.print("\t" +b[i]);
        }

    }

}
