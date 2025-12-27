import java.util.*;
public class SubarraySum_NegativeNo {
   static void maxLen(int arr[], int n)
    {
        // Your code here
        ArrayList<Integer>l=new ArrayList<>();
        int sum=0;
        int j=0;
        int no=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>0) {
                while (sum > 0 && j < i) {
                    sum = sum - arr[j];
                    j++;
                }
            }
            if(sum==0){
                no=i-j+1;
                l.add(no);
            }
        }
        System.out.println(l);
       int h=l.size();
        System.out.println(l.get(h-1));

    }
    public static void main(String[]vi){
        int []arr={15,-2,2,-8,1,7,10,23};
       maxLen(arr,8);

    }
}
