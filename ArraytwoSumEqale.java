import java.util.Scanner;

public class ArraytwoSumEqale {
    public static int equilibriumPoint(int arr[], int n) {

        // Your code here
        int m=(n-1)/2;
        int sum=0;
        int sum1=0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                sum+=arr[i];
            }
            for(int i=m+1;i<n;i++){
                sum1+=arr[i];
            }
            if(sum==sum1){
                return m+1;
            }
              else if(sum>sum1){
                    m=m-1;
                }
              else{
                    m=m+1;
                }
        }

        return -1;
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
        System.out.println(equilibriumPoint(a,n));
    }
}
