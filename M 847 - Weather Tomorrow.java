import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();

        long x = input.nextLong();
        long y = input.nextLong();
        long selisih = x - y;

        boolean isTrue = true;

        if (x - y != selisih) {            
            isTrue = false;
        }

        for (int i = 0; i < n - 2; i++) {
            x = y;

            y = input.nextLong();
            
            if (x - y != selisih) {
                isTrue = false;
            }
        }

        System.out.println(isTrue == true ? y - selisih : y);
    }
}
