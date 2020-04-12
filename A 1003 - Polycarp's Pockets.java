import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        
        int [] data = new int [n];
        
        for (int i = 0; i < n; i++) {
            data [i] = input.nextInt();
        }
        
        Arrays.sort(data);
        
        int count = 1,simpan = 1;
        for (int i = 0; i < n-1; i++) {
            if(data [i] == data [i+1]){
                count ++;
            }else{                
                count = 1;
            }
            
            if(simpan < count){
                simpan = count;
            }                                       
        }
        System.out.println(simpan);
    }
    
}
