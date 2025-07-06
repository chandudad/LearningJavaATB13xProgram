package ex_10_Switch;
import java.util.Scanner;
public class Lab_74_Switch_Without_default {
    public static void main(String[] args) {
        System.out.println("Enter the days 1 to 7");
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday"); // in switch statement if we don't use default keyword then system won't print anything which is not related to case
        }
    }
}
