import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i;
        System.out.print("Enter a String:\t");
        str=sc.nextLine();
        sc.close();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            break;
        }
        if(i==str.length())
        System.out.println("String is palindrome");
        else
        System.out.println("String is not palindrome");
    }
}
