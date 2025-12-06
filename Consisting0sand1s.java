import java.util.Scanner;
public class Consisting0sand1s {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");}
       // System.out.println();
         }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
        arr[j]=temp;}
    static void zerosandones(int[]arr){
        int left=0, right=arr.length-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;}
            if(arr[left]==0){
                left++;}
            if (arr[right]==1){
                right--;}
        }
       // printarray(arr);
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
        zerosandones(a);
        printarray(a);
    }
}
