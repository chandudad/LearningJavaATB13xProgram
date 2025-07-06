package ex_10_Switch;

public class Lab_81_JDK_13_Above {
    public static void main(String[] args) {
        //in JDK 13
        //NO need of break keyword
        //one line supported
        int itemcode = 002;
        switch(itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
