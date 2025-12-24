import java.util.Scanner;
public class SortEvenfirstOddlast {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortorder(int []arr){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String[]vijay){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the element of array");
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();}
        System.out.println("orizenal array");
        printarray(a);
        System.out.println("sorted array");
        sortorder(a);
        printarray(a);
    }
}
