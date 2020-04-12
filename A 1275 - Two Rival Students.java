import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[input.nextInt()][4];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }

        int m, n, a, b, result;
        for (int i = 0; i < data.length; i++) {
            result = 0;
            m = data[i][0];
            n = data[i][1];
            a = data[i][2];
            b = data[i][3];

            if (a < b) {
                result = a;
                a = b;
                b = result;
                result = 0;
            }
            for (int j = 0; j < n; j++) {
                if (a == m && b == 1) {
                    break;
                }
                if (a < m) {
                    a++;
                } else if (b > 1) {
                    b--;
                }
                

            }
            result = a-b;
            System.out.println(result);
        }
    }
}
