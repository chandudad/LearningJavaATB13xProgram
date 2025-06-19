package ex_Java_Task;
import java.util.*;
public class Prime_Number_Finder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;


            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

}
