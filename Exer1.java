package Branching;
import java.util.Scanner;
public class Exer1 {
    public static void main (String args[]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
