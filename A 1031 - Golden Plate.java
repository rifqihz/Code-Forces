import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int x,y,n;
        x = input.nextInt();
        y = input.nextInt();
        n = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count + 2 * (x+y) - 4;
            x = x-4;
            y = y-4;
        }
        
        System.out.println(count);
        
    }        
}
