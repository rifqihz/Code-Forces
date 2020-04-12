import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0;
        while (x != 0) {
            if (x >= 100) {
                count++;
                x -= 100;
            } else if (x >= 20) {
                count++;
                x -= 20;
            } else if (x >= 10) {
                count++;
                x -= 10;
            } else if (x >= 5) {
                count++;
                x -= 5;
            } else if (x >= 0) {
                count++;
                x -= 1;
            }
        }
        System.out.println(count);
    }
}
