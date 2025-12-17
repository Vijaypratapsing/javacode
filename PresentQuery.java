import java.util.Scanner;
public class PresentQuery {
    static int[] makefrequencyarray(int[]arr){
        int []freq=new int[10000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
    System.out.println("enter the no of element");
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int []frq=makefrequencyarray(arr);
    System.out.println("enter the no of queries");
    int q=sc.nextInt();
    while(q>0){
        System.out.println("enter the no to be search");
        int no=sc.nextInt();
        if(frq[no]>0){
            System.out.println("YES");}
            else
            {
                System.out.println("NO");
            }
            q--;

    }
}
}
