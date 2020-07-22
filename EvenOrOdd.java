package Branching;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            if (a == 0){
                break;
            }
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}
