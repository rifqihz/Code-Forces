import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int[] data = new int[x];
        double total = 0;
        for (int i = 0; i < x; i++) {
            data[i] = input.nextInt();
            total = total + data[i];
        }

        total = (double) total / x;
        System.out.println(total);
    }
}
