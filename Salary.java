import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        System.out.println("Enter your basic salary:\t");
        Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();
        int hra=salary*30/100;
        int ta=salary*20/100;
        int da=salary*10/100;
        int pf=1500;
        int netsalary=salary+hra+ta+da-pf;
        System.out.println("Your net salary is "+netsalary);
        sc.close();
    }
}