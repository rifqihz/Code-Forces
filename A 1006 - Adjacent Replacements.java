import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
            if (data[i] % 2 == 0) {
                data[i] = data[i] - 1;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

    }
}
