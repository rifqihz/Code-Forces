import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];

        int count;
        if (data.length > 0) {
            count = 1;
        } else {
            count = 0;
        }
        String x = "";
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
            if (i != 0) {
                if (data[i] == 1) {
                    x = x + data[i - 1] + " ";
                    count++;
                }
            }
            if (i == data.length - 1) {
                x = x + data[i];
            }
        }
        System.out.println(count);
        System.out.println(x);

    }
}
