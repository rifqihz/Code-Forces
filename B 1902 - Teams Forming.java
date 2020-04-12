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
        int count = 0;
        for (int i = 0; i < data.length - 1; i = i + 2) {
            while (data[i] != data[i + 1]) {
                data[i] = data[i] + 1;
                count++;
            }
        }
        System.out.println(count
        );
    }
}
