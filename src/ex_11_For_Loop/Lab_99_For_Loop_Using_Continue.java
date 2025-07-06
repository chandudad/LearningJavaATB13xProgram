package ex_11_For_Loop;

public class Lab_99_For_Loop_Using_Continue {
    public static void main(String[] args) {
        for(int i =0;i<50;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
