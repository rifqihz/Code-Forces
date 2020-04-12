import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String x = input.nextLine();
        int count = 1;
        byte s = 0;
        for (int i = 0; i < x.length()-1; i++) {
            
            if(x.charAt(i) == x.charAt(i+1)){
                s++;                
            }else{
                s = 0;
                count++;
            }
            if(s == 5){
                s = 0;
                count++;
            }
        }
        System.out.println(count);
    }
}
