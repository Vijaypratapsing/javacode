import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=sc.nextLine();
        System.out.print("Enter your class:");
        int classname=sc.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        float Math=sc.nextFloat();
        System.out.print("Enter marks in Physics: ");
        float Physics=sc.nextFloat();
        System.out.print("Enter marks in Chemistry: ");
        float Chemistry=sc.nextFloat();
        System.out.print("Enter marks in Biology: ");
        float Biology=sc.nextFloat();
        System.out.print("Enter marks in Hindi: ");
        int Hindi=sc.nextInt();
        float total_marks=Math+Physics+Chemistry+Biology+Hindi;
        float percentage=total_marks/500*100;
        float avgmarks=(Math+Physics+Chemistry+Biology+Hindi)/5;
        System.out.println("Student Name: "+name);
        System.out.println("Class: "+classname);
        System.out.println("Total Marks: "+total_marks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Avarage Marks: "+avgmarks);
        sc.close();
    }
}
