import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] [] data = new int [input.nextInt()] [3];
        
        String a = null,b = null;
        int x = 0,y = 0;
        int s = 0,t = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data [i] [j] = input.nextInt();
                
            }
            if(data [i] [0] == 1){
                x = x + data [i] [1];
                s = s + data [i] [2];
            }else{
                y = y + data [i] [1];
                t = t + data [i] [2];
            }
        }        
        a = x >= s ? "LIVE" : "DEAD";
        b = y >= t ? "LIVE" : "DEAD";
        
        System.out.println(a);
        System.out.println(b);
    }
}
