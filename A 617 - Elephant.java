import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0;
        while (x != 0) {
            if (x >= 5) {
                x = x - 5;
                count++;
            } else if (x >= 4) {
                x = x - 4;
                count++;
            } else if (x >= 3) {
                x = x - 3;
                count++;
            } else if (x >= 2) {
                x = x - 2;
                count++;
            } else if (x >= 1) {
                x = x - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
