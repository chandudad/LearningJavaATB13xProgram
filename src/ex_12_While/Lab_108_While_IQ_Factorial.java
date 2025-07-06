package ex_12_While;
import java.util.*;
public class Lab_108_While_IQ_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Facttorial Program\n Enter the number");

        if(!s.hasNextInt()){
            System.out.println("Enter the int you fool!");
            return;
        }
        int number = s.nextInt();
        int factorial = 1;
        if(number < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }
        if(number<=0){
            System.out.println(factorial);
        }
        else{
            //Calculate the factorial program
            for(int i=1;i<=number;i++){
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial is ->" + factorial);
    }
}
