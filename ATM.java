import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin,n;//pin is 1232
        float balance=25000,amount;
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.print("\nSelect Option:\t");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.print("Enter amount:\t");
            amount=sc.nextFloat();
            balance+=amount;
            System.out.println("Deposit Successful\nYour Current balance is "+balance);
            break;
            case 2:
            System.out.print("Enter pin:\t");
            pin=sc.nextInt();
            if(pin==1232)
            {
                System.out.print("Enter amaount:\t");
                amount=sc.nextFloat();
                balance-=amount;
                System.out.println("Withdraw Successful\nYour Current balance is "+balance);
            }
            else
            System.out.println("Invalid Pin");
            break;
            case 3:
            System.out.print("Enter pin:\t");
            pin=sc.nextInt();
            if(pin==1232)
            System.out.println("Your Curren balance is "+balance);
            else
            System.out.println("Invalid Pin");
            break;
            default:
            System.out.println("Invalid Selection");
        }
        sc.close();
    }
}
