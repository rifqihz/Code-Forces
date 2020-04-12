import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String card = input.next();
        
        String [] data = new String [5];
        
        for (int i = 0; i < 5; i++) {
            data [i] = input.next().toUpperCase();
        }
        
        boolean x = false;
        for (int i = 0; i < 5; i++) {
            if(data [i].charAt(0) == card.charAt(0) || data[i].charAt(1) == card.charAt(1)){
                System.out.println("YES");
                x = true;
                break;
            }            
        }
        if(x == false){
            System.out.println("NO");
        }
        
    }
}
