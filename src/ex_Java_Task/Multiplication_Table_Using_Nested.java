package ex_Java_Task;
import java.util.*;
public class Multiplication_Table_Using_Nested {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value");

        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.println(i + "X" + j + "=" + (i*j));
            }
            System.out.println();
        }

    }

}
