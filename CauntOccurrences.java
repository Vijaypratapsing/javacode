import java.util.Scanner;
public class CauntOccurrences {
    static int occurrences(int arr[],int x){
        int caunt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                caunt++;
            }
        }
        return caunt;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the lenght of array");
        int n=sc.nextInt();
        System.out.println("enter the element x");
        int x=sc.nextInt();
        System.out.print("enter the element of array");
        int[] a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(occurrences(a,x));
    }
    }
