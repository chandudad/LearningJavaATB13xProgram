package ex_07_User_Input;
import java.util.*;
public class Lab_UseInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner s = new Scanner(System.in);
        System.out.println(s.next());
        System.out.println("Enter the int");
        int i = s.nextInt();
        System.out.println(i);
        System.out.println("Enter the Double");
        double d = s.nextDouble();
        System.out.println(d);



    }
}
