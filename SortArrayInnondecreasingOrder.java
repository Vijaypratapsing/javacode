import java.util.Scanner;
public class SortArrayInnondecreasingOrder {

  static void swap(int[]arr,int n,int m){
      int temp= arr[n];
    arr[n]=arr[m];
    arr[m]=temp;
  }
  static void reverce(int[]arr){
      int i=0;
      int j=arr.length-1;
      while (i<=j){
          swap(arr,i,j);
          i++;
          j--;
      }
  }
   static void printarray(int arr[]){
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println("  ");
   }
    static int[] sqsort(int[]arr){
        int n=arr.length;
        int left=0,right=n-1,k=0;
        int[]ar=new int[n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ar[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ar[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ar;
    }
    public static void main(String[]vijay){
       int[]p={2,6,8,9,10};
       printarray(p);
       int[]ans=sqsort(p);
       reverce(ans);
       printarray(ans);
    }
}
