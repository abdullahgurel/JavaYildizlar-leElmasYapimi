import java.util.Scanner;
public class elmasYapimi {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int n = input.nextInt();

       int n = 1;
       int l = 5;
       for (int m = 1;m<=l;m++){
           for (int o = 1;o<=(l-m);o++) {
               System.out.print(" ");
           }
           for (int d =1;d<=(2*m)-1;d++) {
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i =4;i>=n;i--) {
            for (int k =5;k>=(n+i);k--) {
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
