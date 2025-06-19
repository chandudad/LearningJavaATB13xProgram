package ex_Java_Task;
import java.util.*;
public class Factorial_Using_While_Loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value");

        int a=s.nextInt();
        int temp=1;
        if(a>0)
        {
            int i=a;
            while(i>0)
            {
                temp=temp*i;
                i--;
            }
            System.out.println("Factorial of "+a+" is "+temp);
        }
        else{
            System.out.println("Enter valid number");
        }

    }

}
