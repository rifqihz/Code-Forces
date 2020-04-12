import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        String y;
        
        x = input.nextInt();
        input.nextLine();
        y = input.next();
        int countZ = 0;
        for (int i = 0; i < y.length(); i++) {
            if(y.charAt(i) == 'z'){
                countZ++;
            }
        }                
        x = (x - (countZ * 4)) /3;
        
        for (int i = 0; i < x; i++) {
            System.out.print("1 ");
        }
        for (int i = 0; i < countZ; i++) {
            System.out.println("0 ");
        }
    }
    
}
