import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];
        int count = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
            if (i != 0) {
                if (data[i] != data[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
