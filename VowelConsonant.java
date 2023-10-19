import java.util.Scanner;;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a Character:\t");
        a=sc.next().charAt(0);
        sc.close();
        switch(a)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println(a+" is a vowel");
            break;
            default:
            System.out.println(a+" is a consonant");
        }


    }
}
