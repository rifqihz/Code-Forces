import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[] data = new long[input.nextInt()];
        long n = input.nextInt();
        
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextLong();
        }

        
        
        long count = 0;
        long x;
        long fuck = 1;
        for (int i = 0; i < data.length-1; i++) {            
            if (data [i] % n != data[i+1] % n) {
                count = -1;
                break;
            } else {
                if (data[i] > data[i+1]) {                    
                    
                    count = count +  fuck * ((data [i] - data [i+1]) /n);
                    fuck++;                    
                }else if(data [i] < data [i+1]){
                    
                    count = count + ((data [i+1] - data [i]) /n );
                    fuck++;
                    data [i+1] = data [i];
                }else if(data [i] == data [i+1]){
                    fuck++;                    
                }
            }            
        }
    System.out.println (count);
    }

}
