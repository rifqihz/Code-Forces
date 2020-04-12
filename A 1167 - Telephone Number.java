import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[input.nextInt() * 2];

        int x, dif;
        String t;
        boolean isTrue;
        for (int i = 0; i < data.length; i++) {
            data[i] = input.next();
        }

        for (int i = 0; i < data.length; i = i + 2) {
            isTrue = false;
            x = Integer.parseInt(data[i]);
            t = data[i + 1];

            if (x != 11) {
                dif = x - 11;
                for (int j = 0; j <= dif; j++) {
                    if (t.charAt(j) == '8') {
                        System.out.println("YES");
                        isTrue = true;
                        break;
                    }
                }
            } else {
                if (t.charAt(0) == '8') {
                    System.out.println("YES");
                    isTrue = true;                    
                }
            }
                if (isTrue == false) {
                    System.out.println("NO");
                }
        }

    }
}
