import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, pembagi;
        n = input.nextInt();

        pembagi = input.nextInt();

        for (int i = 0; i < pembagi; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n--;
            }
        }

        System.out.println(n);
    }
}
