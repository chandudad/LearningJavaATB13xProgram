package ex_11_For_Loop;

public class Lab_100_For_Loop_Using_Continue_Finding_Even_Odd {
    public static void main(String[] args) {
        for(int i = 0;i<50;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Odd ->" + i);
        }
    }
}
