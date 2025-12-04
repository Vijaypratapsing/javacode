import java.util.Scanner;
public class ArrayRotate_K_staps {
    static void Swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Revers(int[]arr,int i,int j){
        while(i<j){
            Swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void Rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        Revers(arr,0,n-k-1);
        Revers(arr,n-k,n-1);
       Revers(arr,0,n-1);
    }
    static void Printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of Array");
        int n=sc.nextInt();
        System.out.println("Enter the steps to Rotate the array");
        int k=sc.nextInt();
        System.out.println("Enter the array");
        int []arr=new int [n];
        for (int i=0;i < n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("origenal array");
        Printarray(arr);
        Rotate(arr,k);
        System.out.println("After rotate array");
        Printarray(arr);

    }
}
