import java.util.Scanner;
import java.util.Arrays;
public class KhushaAndArray {
 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int [] data = new int [input.nextInt()];
        
        for (int i = 0; i < data.length; i++) {
            data [i] = input.nextInt();
        }
        
        Arrays.sort(data);
        boolean cek = true;
        for (int i = 1; i < data.length; i++) {
            if(data[i] % data [0] != 0){
                System.out.println(-1);
                cek = false;
                break;
            }
        }
        
        if(cek){
            System.out.println(data[0]);
        }
    }
    
}
