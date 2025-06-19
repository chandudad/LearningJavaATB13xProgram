package ex_02_Java_Basics;

public class Lab019_Numerics_Data_types {
    public static void main(String[] args) {
        byte b = 100; //- it is allowed
       // b = 128; //it is not allowed because max size is 127
        b= -127;
        /* b = -129; // not allowed min value is starting from -128 */
        System.out.println(b);

    }
}
