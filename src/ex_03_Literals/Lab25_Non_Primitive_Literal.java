package ex_03_Literals;

public class Lab25_Non_Primitive_Literal {
    public static void main(String[] args) {
        //Default value of any reference variable is null
        //Primitive data types is defined by java
        byte b = 10; // 1 Byte = 8 bits
        int age = 60; ; // int = 4 Byte = 32 bits
        // Non-Primitive data types is defeined by user
        // no size, min, max is not defined
        String name = "Pramod"; //String is a bunch of charcters
        int [] array_of_items = new int[0];
        //String, enum, array_classes
        //only nonprimitive data types are null values
        String s = null;
       // int i = null; // integer can't be null value
        System.out.println(s);
    }
}
