import java.util.Scanner;

public class Squat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] data = new char[input.nextInt()];

        String y = input.next();
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = y.charAt(i);
            if (data[i] == 'X') {
                count++;
            }
        }
        System.out.println(Math.abs(data.length / 2 - count));

        if (data.length / 2 - count == 0) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]);
            }
        } else if (data.length / 2 - count < 0) {
            for (int i = 0; i < Math.abs(data.length / 2 - count); i++) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j] == 'X') {
                        data[j] = 'x';
                        break;
                    }

                }
            }

            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]);
            }

        } else {
            for (int i = 0; i < data.length / 2 - count; i++) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j] == 'x') {
                        data[j] = 'X';
                        break;
                    }

                }
            }

            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]);
            }
        }

    }
}
