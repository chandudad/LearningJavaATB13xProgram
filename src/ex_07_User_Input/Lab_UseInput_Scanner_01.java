package ex_07_User_Input;
import java.util.*;
public class Lab_UseInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = s.nextInt();
        String canIVote = age > 18? "Yes" : "No";
        System.out.println(canIVote);

    }
}
