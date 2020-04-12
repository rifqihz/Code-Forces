import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String x = input.next();

        String hasil = "";
        for (int i = 0; i < n;) {
            for (int j = 1;; j++) {
                hasil = hasil + x.charAt(i);
                i = i + j;
                if (i >= n) {
                    break;
                }
            }
        
        }
        System.out.println(hasil);
    }

}
