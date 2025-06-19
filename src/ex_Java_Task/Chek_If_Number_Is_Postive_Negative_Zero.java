package ex_Java_Task;
import java.util.*;
public class Chek_If_Number_Is_Postive_Negative_Zero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("enter any value ");
        a = s.nextInt();
        if (a > 0) {
            System.out.println(a + " is positive");
        } else if (a < 0) {
            System.out.println(a + " is negative");
        } else {
            System.out.println(a + " is zero");
        }
    }
}