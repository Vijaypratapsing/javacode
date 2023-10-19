import java.util.Scanner;
public class Discount_Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price,discount=0,total;
        System.out.print("Enter total price:\t");
        price=sc.nextInt();
        sc.close();
        if(price>=1000&&price<=5000)
        discount=price*5/100;
        else if(price<=10000)
        discount=price*10/100;
        else if(price<=20000)
        discount=price*15/100;
        else
        discount=price*25/100;
        total=price-discount;
        System.out.println("Total price\t=\t"+price);
        System.out.println("Discount\t=\t"+discount);
        System.out.println("Tatal amount\t=\t"+total);
    }
}
