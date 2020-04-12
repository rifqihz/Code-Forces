import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] data = new int [input.nextInt()];
        boolean isHard = true;
        for (int i = 0; i < data.length; i++) {
            data [i] = input.nextInt();
            if(data [i] == 1){
                System.out.println("HARD");
                isHard = false;
                break;
            }
        }
        
        if (isHard) {
            System.out.println("EASY");            
        }
        
    }
}
