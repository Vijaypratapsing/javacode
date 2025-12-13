import java.util.Scanner;
public class MatrixMul {
    static void printarray(int mul[][]) {
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Mulmatrix(int[][]arr1,int[][]arr2,int r1,int c1,int r2, int c2){
        if(r2!=c1){
            System.out.println("Invalid input");
            return;
        }
        int[][]mul=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }float k=4.3f;
        }
        System.out.println("mulmatrix");
        printarray(mul);
    }
    public static void main(String[]vijay){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first row size");
        int r1=sc.nextInt();
        System.out.println("Enter the size of first matrix column");
        int c1=sc.nextInt();
        System.out.println("Enter the size of second matrix row");
       int r2=sc.nextInt();
        System.out.println("Enter the size of second matrix column");
        int c2=sc.nextInt();
        System.out.println("Enter the Element of First Matrix");
        int[][]arr1=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
          }
        }
        System.out.println("Enter the Element of Second Matrix");
        int[][]arr2=new int[r2][c2];
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
           }
        }
        Mulmatrix(arr1,arr2,r1,c1,r2,c2);
        //int row1=4,col1=3,row2=3,col2=4;
        //int a[][]={{1,1,1},
          //      {2,2,2},
            //    {3,3,3},
              //  {4,4,4}
        //};
        //int b[][]={{1,1,1,1},
          //      {2,2,2,2},
            //    {3,3,3,3},
              //  {4,4,4,4}};
      //  Mulmatrix(a,b,row1,col1,row2,col2);
    }
}
