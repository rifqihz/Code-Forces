import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0, a = 2, simpan = x;
        while (x != 0) {
            a = 2;
            if (x == 3) {
                a = 3;
            }
            x = x - a;
            count++;
        }
        System.out.println(count);
        while (simpan != 0) {
            a = 2;
            if (simpan == 3) {
                a = 3;
            }
            simpan = simpan - a;
            System.out.print(a + " ");
        }

    }
}
