import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x, y;
        boolean can = true;
        char[] volems = {'a', 'i', 'u', 'e', 'o'};

        x = input.nextLine();
        y = input.nextLine();

        if (x.length() != y.length()) {
            can = false;
        } else {
            for (int i = 0; i < x.length(); i++) {                
                boolean V2 = false;
                boolean V1 = false;
                if (x.charAt(i) != y.charAt(i)) {
                    for (int j = 0; j < volems.length; j++) {
                        if (x.charAt(i) == volems[j]) {
                            V1 = true;
                        }
                        if (y.charAt(i) == volems[j]) {
                            V2 = true;
                        }
                    }
                    if (V1 != V2) {
                        can = false;
                        break;
                    }

                }
            }
        }
        
        System.out.println(can ? "Yes" : "No" );
    }

}
