public class patternSquar {
    public static void main(String[]vijay){
        for (int i=0;i<=5;i++){
            for (int j=0;j<=5;j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
          System.out.println();

        }
    }
}
