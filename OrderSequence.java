package Branching;
import java.util.Scanner;
public class OrderSequence {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int oldNum = scanner.nextInt();
        int newNum;
        int asc = 0;
        int dec = 0;
        System.out.println(oldNum);
        while ((newNum = scanner.nextInt()) != 0) {
            if (newNum > oldNum) {
                asc++;
            }
            if (newNum < oldNum) {
                dec++;
            }
            oldNum = newNum;
        }
        System.out.println(asc == 0 || dec == 0);
    }
}
