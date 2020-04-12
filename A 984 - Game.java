import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];

        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        
        Arrays.sort(data);
        
        System.out.println(data.length%2 == 1? data[data.length / 2] : data [data.length/2 -1]);
        
    }
}
