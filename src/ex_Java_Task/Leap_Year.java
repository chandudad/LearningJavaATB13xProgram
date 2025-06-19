package ex_Java_Task;
import java.util.* ;
public class Leap_Year {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year");
        int a =s.nextInt();
        if((a % 4 ==0 && a % 100 != 0) || a % 400 ==0)
        {
            System.out.println(a + " " + "It is a leap year");
        }
        else
        {
            System.out.println(a + " " + "It is not a leap");
        }
    }

}
