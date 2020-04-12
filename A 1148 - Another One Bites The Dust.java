import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a, b, c;

        a = input.nextLong();
        b = input.nextLong();
        c = input.nextLong();

        if (a > b) {
            if (a - b >= 1) {
                System.out.println((a - (a - b)) + 1 + b + c * 2);
            } else {
                System.out.println(a + b + c * 2);
            }
        } else if (b > a) {
            if (b - a > 1) {
                System.out.println(a + b - (b - a) + 1 + c * 2);
            } else {
                System.out.println(a + b + c * 2);
            }
        } else {
            System.out.println(a + b + c * 2);
        }
    }
}
