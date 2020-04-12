import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];
        int x, count;
        
        for (int i = 0; i < data.length; i++) {
            data [i] = input.nextInt();
        }
        for (int i = 0; i < data.length; i++) {
            x = data[i];
            count = 0;
            while (x > 0) {
                count++;
                x = x - 7;
            }
            System.out.println(count);
        }

    }
}
