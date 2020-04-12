import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[2][input.nextInt()];
        int c = input.nextInt();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }
        int x = 0, y = 0;
        int L = 0, T = 0;
        for (int i = 0, j = data[0].length - 1; i < data[0].length && j >= 0; i++, j--) {
            x = x + data[1][i];
            y = y + data[1][j];
            L = L + HitungNilai(data[0][i], c, x);
            T = T + HitungNilai(data[0][j], c, y);

        }
        if (L == T) {
            System.out.println("Tie");
        } else {
            System.out.println(L > T ? "Limak" : "Radewoosh");
        }
    }

    public static int HitungNilai(int data, int c, int z) {
        if (data - (c * z) > 0) {
            return data - (c * z);
        } else {
            return 0;
        }
    }

}
