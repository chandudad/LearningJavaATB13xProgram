package ex_03_Literals;

public class Lab24_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a to z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 =  '(';
        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("PramodDutta");
        System.out.println("Pramod" + new_line + "Dutta");
        System.out.println("Pramod" + tab_line + "Dutta");
        System.out.println("Pramod" + back_space + "Dutta");
        System.out.println("Pramod" + carriage_return + "Dutta");

    }
}
