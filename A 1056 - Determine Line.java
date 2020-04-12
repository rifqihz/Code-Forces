import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data, data2;
        int n = input.nextInt();

        data = new int[input.nextInt()];
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        boolean isTrue;
        for (int i = 0; i < n - 1; i++) {

            data2 = new int[input.nextInt()];
            for (int j = 0; j < data2.length; j++) {
                data2[j] = input.nextInt();
            }
            for (int j = 0; j < data.length; j++) {
                isTrue = false;
                if (data[j] != 0) {
                    for (int k = 0; k < data2.length; k++) {
                        if (data[j] == data2[k]) {
                            isTrue = true;
                            break;
                        }

                    }
                    if (isTrue == false) {
                        data[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
