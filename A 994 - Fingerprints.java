import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] fingerprint = new int [input.nextInt()];
        int [] key = new int [input.nextInt()];
        
        for (int i = 0; i < fingerprint.length; i++) {
            fingerprint [i] = input.nextInt();
        }
        for (int i = 0; i < key.length; i++) {
            key [i] = input.nextInt();
        }
        
        for (int i = 0; i < fingerprint.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if(fingerprint [i] == key [j]){
                    System.out.print(fingerprint [i]+ " ");
                }
            }
        }
    }
}
 
