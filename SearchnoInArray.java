import java.util.Scanner;
public class SearchnoInArray {
    static int[] frequencyArray(int[]arr){
        int []frequency=new int[10000];
        for (int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        return frequency;
    }
    public static void main(String[]vijay){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element of array");
        int n =sc.nextInt();
        System.out.println("enter the element of array");
        int[] a=new int[n];
        for (int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        int []freq=frequencyArray(a);
     //   frequencyArray(a);
        System.out.println("enter the no of queries");
        int q=sc.nextInt();
        while(0<q){
            System.out.println("enter the no to be searched");
            int s=sc.nextInt();
            if(freq[s]>0)
                System.out.println("yes");
            else
                System.out.println("NO");
            q--;
        }
    }
}
