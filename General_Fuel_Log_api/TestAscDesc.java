package Branching.General_Fuel_Log_api;
import java.util.Scanner;
public class TestAscDesc {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int old = sc.nextInt();
        int new_n;
        while ((new_n = sc.nextInt()) != 0){
            System.out.println(old+ " old number");
            System.out.println(new_n+ " new number");
        }
    }
}
