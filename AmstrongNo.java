import java.util.Scanner;
public class AmstrongNo {

    static int count(int n){
        int c=0;
        while (n!=0){
            int s=n%10;
            n=n/10;
            c++;
        }
        return c;
    }
    static int  pow(int n,int c) {
      int p=0;
        while (c > 0) {
           // int p = 0;
            p+=n*n*n;
            c--;
        }
        return p;
    }
    static void  amst(int n){
     int copy=n;
      int c=  count(n);
     int p= pow(n,c);
      if(p==copy){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }
    }

    public static void main(String[]vijay){
        int n=153;
        amst(n);

    }
}
