import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long [] [] data = new long [input.nextInt()] [3];
        long hasil = 0,a,b,x;
        
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data [i] [j] = input.nextLong();
            }
        }
        for (int i = 0; i < data.length; i++) {
                hasil = 0;
                a = data [i] [0];
                b = data [i] [1];                                                
                x = data [i] [2];
                if(a == b){
                    if(x%2 == 0){
                        System.out.println(0);
                    }else{
                        System.out.println(a);
                    }
                }else{
                
                if(x % 2 == 1){                    
                    hasil = a*((x /2)+1);
                    hasil = hasil - (b * (x/2));
                }else{
                    hasil =  a*(x/2);
                    hasil = hasil - (b*(x/2));
                }                
            
            System.out.println(hasil);
            }
        }
        
        
    }
}
