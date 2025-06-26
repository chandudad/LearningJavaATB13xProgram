package ex_String_Program_Test;
import java.util.*;
public class String_Manipulation extends RuntimeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        char firstChar = input.charAt(0);
        String substring = input.substring(6);  // "World" starts at index 6
        System.out.println("Length: " + length + ", First char: " + firstChar + ", Substring: " + substring);
    }

}
