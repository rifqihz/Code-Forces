import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = input.nextInt();
        }

        Arrays.sort(data);

        int count = 0;
        while (data[0] + data[1] <= data[2]) {
            data[0] = data[0] + 1;
            count++;
        }

        System.out.println(count);

    }
}
