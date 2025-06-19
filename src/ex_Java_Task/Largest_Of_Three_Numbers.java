package ex_Java_Task;
import java.util.*;
public class Largest_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);

        int a,b,c;

        System.out.println("enter three value ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greater");
        }
        else
        {
            System.out.println(c+" is greater");
        }

    }

}
