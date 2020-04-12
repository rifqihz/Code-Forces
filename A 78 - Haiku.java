import java.util.Scanner;

public class Haiku {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        int count;
        boolean isTrue = true;
        for (int i = 0; i < 3; i++) {
            x = input.nextLine().toLowerCase();
            count = 0;
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == 'a' || x.charAt(j) == 'i' || x.charAt(j) == 'u' || x.charAt(j) == 'e' || x.charAt(j) == 'o') {
                    count++;
                }
            }
            if (i == 0 && count != 5 || i == 2 && count != 5) {
                isTrue = false;
            } else if (i == 1 && count != 7) {
                isTrue = false;
            }
            if (isTrue == false) {
                System.out.println("NO");
                break;
            }
        }

        if (isTrue == true) {
            System.out.println("YES");
        }
    }
}
