package ex_10_Switch;
import java.util.*;
public class Lab_72_Switch {
    public static void main(String[] args) {
        System.out.println("Enter the days 1 to 7");
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
