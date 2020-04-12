import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String ganjil = "I hate", genap = "I love";

        for (int i = 1; i <= x; i++) {
            if (i != x) {
                if (i % 2 == 1) {
                    System.out.print(ganjil);
                } else {
                    System.out.print(genap);
                }
                System.out.print(" that ");

            } else {
                if (i % 2 == 1) {
                    System.out.print(ganjil);
                } else {
                    System.out.print(genap);
                }
                System.out.print(" it");
            }
        }

    }
}
