import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String x = input.nextLine();
        
        int a = 0,b = x.length();
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'a'){
                a++;
            }
        }
        
        if(a > b/2){
            System.out.println(x.length());
        }else{
            while(a <= b/2){
                b--;
            }
            System.out.println(b);
        }
    }
    
}
 
