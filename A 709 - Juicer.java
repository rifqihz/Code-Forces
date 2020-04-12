import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, b, d, count = 0, overflow = 0;
        int[] data;
        n = input.nextInt();
        b = input.nextInt();
        d = input.nextInt();

        data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
            
            
            if(data[i] > b){
                data [i] = 0;
            }
                
                
            overflow += data[i];

            if (overflow > d) {
                overflow = 0;
                count++;

            }
            

        }
        
        System.out.println(count);

    }

}
