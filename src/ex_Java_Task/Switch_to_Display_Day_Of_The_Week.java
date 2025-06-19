package ex_Java_Task;
import java.util.*;
public class Switch_to_Display_Day_Of_The_Week {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);

        int a;

        System.out.println("enter value between (1 to 7) ");
        a=s.nextInt();

        switch(a)
        {
            case 1:
            {
                System.out.println("Sunday");
                break;
            }
            case 2:
            {
                System.out.println("Monday");
                break;
            }
            case 3:
            {
                System.out.println("Tuesday");
                break;
            }
            case 4:
            {
                System.out.println("Wednesday");
                break;
            }
            case 5:
            {
                System.out.println("Thursday");
                break;
            }
            case 6:
            {
                System.out.println("Friday");
                break;
            }
            case 7:
            {
                System.out.println("Saturday");
                break;
            }
            default:
            {
                System.out.println("Enterr valid number");
            }
        }


    }

}

