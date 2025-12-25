import java.util.*;
public class subarrayEqualToX {
    static ArrayList<Integer> sub(int []arr, int n, int x){
        ArrayList<Integer>l=new ArrayList<>();
        int i=1;
        int j=i+1;
        int p=arr[0];
//        while(){
//             p=p+arr[k];
//            if(p==x){
//                l.add(i);
//                l.add(j);
//                return l;
//            }
//            else {
//                if(p<x){
//                    j++;
//                }else{
//                    i++;
//                }
//            }
//        }
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
