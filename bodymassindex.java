import java.util.Scanner;
public class bodymassindex {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your weight(in Kg):\t");
    float weight=sc.nextFloat();
    System.out.print("Enter your height(Meters):\t");
    float height=sc.nextFloat();
    float bmi=weight/(height*height);
    System.out.println("Your body mass index:\t"+bmi);
    sc.close();
   } 
}