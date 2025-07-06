package ex_10_Switch;

public class Lab_82_JDB13_Multiple_Match {
    public static void main(String[] args) {
        int itemcode = 005;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004,006,007:
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
