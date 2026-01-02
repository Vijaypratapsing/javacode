import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[]vijay){
        Integer j=Integer.valueOf(4);
        System.out.println(j);
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        System.out.print(arr.get(2));
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        System.out.print(arr);
        arr.add(1,100);
        System.out.print(arr);

    }
}
