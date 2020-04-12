import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();

        String data = input.nextLine();
        char[] save = data.toCharArray();
        
        int l, r;
        char x, y;
        for (int i = 0; i < m; i++) {
            l = input.nextInt();
            r = input.nextInt();

            x = input.next().charAt(0);
            y = input.next().charAt(0);

            for (int j = l - 1; j <= r - 1; j++) {
                if (data.charAt(j) == x) {
                    save[j] = y;
                    data = String.copyValueOf(save);
                }

            }

        }
        System.out.println(String.copyValueOf(save));
    }
}
