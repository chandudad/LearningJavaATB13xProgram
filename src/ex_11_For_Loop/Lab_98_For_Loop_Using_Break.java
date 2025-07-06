package ex_11_For_Loop;

public class Lab_98_For_Loop_Using_Break {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i==5){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
