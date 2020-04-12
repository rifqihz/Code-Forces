import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n,x;
        n = input.nextInt();
        x = input.nextInt();
        
        int r = 0,g = 0,b = 0;
        int count = 0;
        
            while(r < 2 * n){
                r = r + x;
                count++;
            }
            while(g < 5 * n){
                g = g + x;
                count++;
            }
            while(b < 8 * n){
                b = b + x;
                count++;
            }
        
        System.out.println(count);
    }
}
