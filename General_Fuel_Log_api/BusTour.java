package Branching.General_Fuel_Log_api;
import java.util.Scanner;
public class BusTour {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int numberOfBridges = sc.nextInt();
        int i = 0;
        int bridgHight = 0;
        int crash = 0;
        while (i < numberOfBridges) {
            bridgHight = sc.nextInt();
            i++;
            if (height < bridgHight) {
                //System.out.println("Will not crash");
                crash ++;
                if (crash==numberOfBridges) {
                    System.out.println("Will not crash");
                }
            } else {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
    }
}
