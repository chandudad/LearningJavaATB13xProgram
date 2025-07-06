package ex_08_Increment_Decrement_Operators;

public class Lab_51_Pre_ID_op_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;             // a+1 = a;
                                 //10+1 = a;
                                // 11 = a;
        System.out.println(a);
        System.out.println(b);

        //Exp and result table
        // line no | a | Result b
        // 5 | 10 | NA
        // 6 | 11 | 11
        // 7 | 11 (NA)| 11
        //8 | 11 | 11 (NA)

    }
}
