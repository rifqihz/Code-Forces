import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String data = input.next();
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (data.charAt(i) == 'x' && data.charAt(i + 1) == 'x' && data.charAt(i + 2) == 'x') {
                count++;
            }
        }

        System.out.println(count);
    }
}
