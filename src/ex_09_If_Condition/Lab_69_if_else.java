package ex_09_If_Condition;
import java.util.*;
public class Lab_69_if_else {
    public static void main(String[] args) {
        //Allowed to vote or not
        // If age > 18  -> allowed to vote
        // else age < 18 -> not allowed to vote
        //int age = Integer.parseInt(age[0]);
        System.out.println("Enter the age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age<=18){
            System.out.println("Not allowed to vote");
        }
        else{
            System.out.println("Allowed to vote");
        }

    }
}
