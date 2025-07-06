package ex_08_Increment_Decrement_Operators;

public class Lab_66_13th_Task_06 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x=" + x + "y=" + y);
    }
}
