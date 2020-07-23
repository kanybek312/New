package Branching.General_Fuel_Log_api;
import java.util.Scanner;
public class IntegerBarrier {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int inputNum;
        do   {
            inputNum = sc.nextInt();
            sum +=inputNum;

            if (sum  >= 1000) {
                System.out.println(sum - 1000);
                break;
            } if (inputNum == 0){
                System.out.println(sum);
            }
        } while (inputNum != 0);
        //System.out.println(sum);
    }
}
