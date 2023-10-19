import java.util.Scanner;

public class Char_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:\t");
        String str=sc.nextLine();
        sc.close();
        System.out.println("Number of Charactor = "+str.length());
    }
}