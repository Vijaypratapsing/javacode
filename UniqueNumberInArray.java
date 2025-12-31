import java.util.Scanner;
public class UniqueNumberInArray {
    static int finduniqueno(int[]arr){
       int ans=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0);
            {
                ans = arr[i];
           }
       }
        return ans;
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element of array of size"+n);
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // int as=finduniqueno(arr);
        System.out.println(finduniqueno(arr));
    }
}
