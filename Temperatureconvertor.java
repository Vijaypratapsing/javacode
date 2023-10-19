import java.util.Scanner;
public class Temperatureconvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float tempF,tempC;
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celcius");
        System.out.print("\nSelect Option:\t");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.print("Enter temperature in celsius:\t");
            tempC=sc.nextFloat();
            tempF=tempC*9/5+32;
             System.out.println("Temperature in fahrenheit:\t"+tempF);
             break;
             case 2:
            System.out.print("Enter temperature in fahrenheit:\t");
            tempF=sc.nextFloat();
            tempC=(tempF-32)*5/9;
             System.out.println("Temperature in Celsius:\t"+tempC);
            break;
            default:
            System.out.println("Invalid Selection");
        }
        sc.close();
    }
}
