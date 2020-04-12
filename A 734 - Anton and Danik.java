import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();
        String x = input.next();

        int a = 0, d = 0;
        for (int i = 0; i < w; i++) {
            if (x.charAt(i) == 'A') {
                a++;
            } else if (x.charAt(i) == 'D') {
                d++;
            }
        }

        if (a > d) {
            System.out.println("Anton");
        } else if (d > a) {
            System.out.println("Danik");
        } else if (a == d) {
            System.out.println("Friendship");
        }
    }

}
