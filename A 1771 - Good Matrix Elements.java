import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int[][] data = new int[x][x];
        x = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
                if (i == j || i == (data.length - 1) / 2 || j == (data.length - 1) / 2 || i + j == data.length - 1 || j + i == data.length - 1) {
                    x = x + data[i][j];

                }
            }
        }
        System.out.println(x);
    }
}
