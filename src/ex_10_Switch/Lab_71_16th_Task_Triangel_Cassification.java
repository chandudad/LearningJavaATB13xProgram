package ex_10_Switch;
import java.util.*;
public class Lab_71_16th_Task_Triangel_Cassification {
    public static void main(String[] args) {
        System.out.println("Enter the sides");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a == b && b == c){
            System.out.println("It is a Equilateral Triangle");
        }
        else if(a == b || b==c || c ==a){
            System.out.println("It is Isosceles Triangle");
        }
        else{
            System.out.println("It is scalene Trinagle");
        }

    }
}
