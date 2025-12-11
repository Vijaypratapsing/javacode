import java.util.Scanner;
public class FindDuplicateInArray {
static int duplicate(int[] arr,int n){
    int ans=0;
    for( int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                System.out.println("index is" +i+ "and" +j);
                 ans=arr[i];
            }
        }
    }
    return ans;
}public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int ans=duplicate(a,n);
        System.out.println(ans);
    }
}

