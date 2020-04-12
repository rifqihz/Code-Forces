import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int[][] data = new int[x][x];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = 1;
            for (int j = 0; j < data[i].length; j++) {
                data[0][j] = 1;
            }
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                data[i][j] = data[i - 1][j] + data[i][j - 1];
            }
        }

        System.out.println(data[x - 1][x - 1]);
    }
}
