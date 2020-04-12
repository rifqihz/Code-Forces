import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        int hasil1, hasil2;
        hasil1 = (data[0] * data[1]) + (2 * data[3]);
        hasil2 = (data[0] * data[2]) + (2 * data[4]);

        if (hasil1 == hasil2) {
            System.out.println("Friendship");
        } else {
            System.out.println(hasil1 < hasil2 ? "First" : "Second");
        }

    }
}
