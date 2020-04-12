import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[5][5];
        int x = 0, y = 0, count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
                if (data[i][j] == 1) {
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        while (x != 3) {
            if (x > 3) {
                x--;
                count++;
            } else if (x < 3) {
                x++;
                count++;
            }
        }

        while (y != 3) {
            if (y > 3) {
                y--;
                count++;
            } else if (y < 3) {
                y++;
                count++;
            }
        }

        System.out.println(count);
    }

}
