import java.util.*;
public class SubarrayWithGivenSum {
    static ArrayList<Integer> sub(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer>l=new ArrayList<>();
        int sum=0;
        int i=0;
        for(int k=0;k<n;){

            sum+=arr[k];

            if(sum==s){
                l.add(i+1);
                l.add(k+1);
                return l;
            }
            else{
                if(s<sum){
                    while(sum!=s){
                        sum=sum-arr[i];
                        i++;
                    }
                    l.add(i+1);
                    l.add(k+1);
                    return l;
                }
                else{
                    k++;
                }
            }
        }
        return l;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(sub(a,n,x));
    }
}
