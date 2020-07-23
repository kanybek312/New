package Branching;
import java.util.Scanner;
public class Sequence {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int i = 0;
         for (int k = 1; k <= number; k++) {
             for ( int j = 0; j < k; j++) {
                 if (i == number) {
                     break;
                 }
                 System.out.print(k +" ");
                 i++;
             }

         }
    }
}
