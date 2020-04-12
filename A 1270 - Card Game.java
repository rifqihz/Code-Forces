import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        
        int [] a;
        int [] b;
        String [] result = new String[input.nextInt()];
        for (int i = 0; i < result.length; i++) {
            input.nextInt();
            a = new int [input.nextInt()];
            b = new int [input.nextInt()];
            for (int j = 0; j < a.length; j++) {
                a [j] = input.nextInt();                
            }            
            for (int j = 0; j < b.length; j++) {
                b [j] = input.nextInt();
            }
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            result [i] = a [a.length-1] > b[b.length-1] ? "YES" : "NO";
            
        }
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
