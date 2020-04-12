import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] [] data =  new int [input.nextInt()] [4];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 4; j++) {
               data [i][j] = input.nextInt();
            }
        }
        
        int [] mark = new int [data.length];
        
        int t = 0,count = 1;
        for (int i = 0; i < mark.length; i++) {
            mark [i] = 0;
            for (int j = 0; j < 4; j++) {
                mark [i] = mark [i] + data [i][j];                
            }
                if(i == 0){
                    t = mark[i];
                }
        }
        Arrays.sort(mark);
        for (int i = mark.length-1; i >= 0; i--) {
            if ( t == mark [i]){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
