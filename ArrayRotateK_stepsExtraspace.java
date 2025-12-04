import java.util.Scanner;

public class ArrayRotateK_stepsExtraspace {
static void Rotate(int[] a, int k) {
    int n = a.length;
    k = k % n;
    int j = 0;
    int[] ans = new int[n];
    for (int i = n - k; i < n; i++) {
        ans[j++] = a[i];
    }
    for (int i = 0; i < n - k; i++) {
        ans[j++] = a[i];
    }
    System.out.println(ans);
   // return ans[];
}
    static void printArray(int[] arr){
    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i] +" ");
    }
        System.out.println();
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.println("Enter the Step to rotate Array");
        int k=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       // int ans[]=new int[n];
        Rotate(a,k);
        printArray(a);
    }
}
