import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[input.nextInt()][5];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }

        int a, b, c, d, k;
        int pen, pencil;
        for (int i = 0; i < data.length; i++) {
            pen = 0;
            pencil = 0;
            a = data[i][0];
            b = data[i][1];
            c = data[i][2];
            d = data[i][3];
            k = data[i][4];

            while (a > 0) {
                pen++;
                a = a - c;
            }
            while (b > 0) {
                pencil++;
                b = b - d;
            }

            if ((pen + pencil) <= k) {
                System.out.println(pen + " " + pencil);
            } else {
                System.out.println(-1);
            }
        }
    }
}
