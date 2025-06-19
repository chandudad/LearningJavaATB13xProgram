package ex_Java_Task;
import java.util.*;
public class Pattern_Using_Nested_Loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value");

        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
