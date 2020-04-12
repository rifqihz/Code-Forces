import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];

        int limit = input.nextInt();
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();

            if (data[i] <= limit) {
                total = total + 1;
            } else {
                total = total + 2;
            }
        }
        System.out.println(total);
    }
}
