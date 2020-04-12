import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();
        short n = 0;
        for (short i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '.') {
                n = i;
                break;
            }
        }
        
        
        if (Character.getNumericValue(in.charAt(n - 1)) == 9) {
            System.out.println("GOTO Vasilisa.");
        } else {
            if (Character.getNumericValue(in.charAt(n + 1)) >= 5) {
                byte save;
                String in2 = in.substring(0, n-1);
                save = (byte) ((byte) Character.getNumericValue(in.charAt(n - 1)) + 1);
                System.out.println(in2 + "" + save);

            } else {
                System.out.println(in.substring(0, n));
            }

        }                        
    }
}
