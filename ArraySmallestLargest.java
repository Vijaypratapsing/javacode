public class ArraySmallestLargest {
static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}

    static int Max(int[] arr){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
}
static int Min(int arr[]){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
public static void main(String[]args){
    int[] arr={1,2,3,4,5};
    System.out.println( Max(arr));
    System.out.println(Min(arr));
    //printarray(arr);
}

}
