import java.util.Scanner;
public class ReverseArrayWithaut_anySpace {
    static void printarray(int []a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
    static void Swap (int arr[],int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    static void Reverse(int[]a){
        int i=0;
        int j=a.length-1;
        while(i<j){
            Swap(a,i,j);
            i++;
            j--;
        }
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
        printarray(a);
        Reverse(a);
        System.out.println("Reverse");
        printarray(a);
       // for(int i=0;i<n;i++){
        //    System.out.print(a[i]+" ");
      //  }
     //   System.out.println();
       // System.out.println("second max value in array  "   +  ans  );

    }
}

