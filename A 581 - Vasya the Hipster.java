import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int a,b;
        a = input.nextInt();        
        
        b = input.nextInt();
        
        
        int countX = 0,countY = 0;
        while(a > 0 && b > 0){        
            a--;
            b--;
            countX++;
        }
        while(a>=2){
            a = a-2;
            countY++;
        }
        while(b >= 2){
            b = b-2;
            countY++;
        }
        
        System.out.println(countX + " " + countY);
    }
    
}
