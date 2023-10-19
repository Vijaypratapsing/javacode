import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary,tax,netsalary;
        System.out.print("Enter Salary:\t");
        salary=sc.nextInt();
        sc.close();
        if(salary<=10000)
        System.out.println("No Tax");
        else if(salary<=20000)
        {
            tax=10*salary/100;
            netsalary=salary-tax;
            System.out.println("Tax = "+tax+(" (10%)"));
            System.out.println("Net Salary = "+netsalary);
        }
        else if(salary<=30000)
        {
            tax=15*salary/100;
            netsalary=salary-tax;
            System.out.println("Tax = "+tax+" (15%)");
            System.out.println("Net Salary = "+netsalary);
        }
        else if(salary>30000)
        {
            tax=25*salary/100;
            netsalary=salary-tax;
            System.out.println("Tax = "+tax+" (25%)");
            System.out.println("Net Salary = "+netsalary);
        }
    }
}
