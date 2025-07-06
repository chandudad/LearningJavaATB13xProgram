package ex_08_Increment_Decrement_Operators;

public class Lab_65_13th_Task_05 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a:" + a);
        System.out.println(b);
    }
}
