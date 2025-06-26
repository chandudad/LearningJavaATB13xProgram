package ex_String_Program_Test;

public class String_Comparsion {
    public static void main(String[] args){
    String string1 = "Hello";
    String string2 = "hello";
    String string3 = "Hello";
    boolean isEqualUsingDoubleEquals = (string1 == string2); // false
    boolean isEqualUsingDoubleEquals2 = (string1 == string3); // true (since both are string literals)
    boolean isEqual = string1.equals(string2); // false
    boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2); // true
    int compareResult = string1.compareTo(string2); // -32 (based on Unicode values)

        System.out.println("== operator: "+isEqualUsingDoubleEquals);
        System.out.println("equals(): "+isEqual);
        System.out.println("equalsIgnoreCase(): "+isEqualIgnoreCase);
        System.out.println("compareTo(): "+compareResult);
}
}
