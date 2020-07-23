package Branching;
import java.util.Scanner;
public class Exer1 {
    public static void main (String args[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i +"i");
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" "+j);
                }
            }
        }
    }
}
