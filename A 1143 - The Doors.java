import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[input.nextInt()];

        int O = 0, Z = 0, count = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
            if (data[i] == 0) {
                Z++;
            } else if (data[i] == 1) {
                O++;
            }
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                Z--;
                count++;
                if (Z == 0) {
                    break;
                }
            } else if (data[i] == 1) {
                O--;
                count++;
                if (O == 0) {
                    break;
                }
            }

        }

        System.out.println(count);

    }
}
