import java.util.Scanner;

public class FindSecondMax {
    static int Max(int arr[]){
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int SecondMax(int arr[]){
        int max=Max(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
       // int second_max=Max(arr);
       // return second_max;
        return Max(arr);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int ans=SecondMax(a);
        System.out.println("second max value in array  "   +  ans  );
    }
}
