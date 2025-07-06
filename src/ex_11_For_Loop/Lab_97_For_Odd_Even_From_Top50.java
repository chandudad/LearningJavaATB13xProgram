package ex_11_For_Loop;

public class Lab_97_For_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        //Find the even numbers from 1 to 50
        for(int i =1; i<50;i++){
            // i%2 ==0
            if(i%2==0){
                System.out.println("Even -> " + i);
            }
        }
    }
}
