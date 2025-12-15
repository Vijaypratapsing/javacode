import java.util.Scanner;
public class PrefixSum {
    static void printarray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixsum(int[]arr){
        int n=arr.length;
        int[] pref=new int [n];
        pref[0]=arr[0];
        for (int i=0;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void main(String[]vijay){
        int p[]={2,4,5,7};
        printarray(p);
       int[]m= prefixsum(p);
       printarray(m);

    }
}
