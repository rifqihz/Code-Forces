import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = {"Time", "Mind", "Soul", "Power", "Reality", "Space"};
        String[] in = new String[input.nextInt()];

        input.nextLine();
        for (int i = 0; i < in.length; i++) {

            switch (input.nextLine()) {
                case "purple":
                    in[i] = "Power";
                    break;
                case "green":
                    in[i] = "Time";
                    break;
                case "blue":
                    in[i] = "Space";
                    break;
                case "orange":
                    in[i] = "Soul";
                    break;
                case "red":
                    in[i] = "Reality";
                    break;
                case "yellow":
                    in[i] = "Mind";
                    break;
            }
        }

        System.out.println(6 - in.length);
        boolean isTrue;
        for (int i = 0; i < data.length; i++) {
            isTrue = true;
            for (int j = 0; j < in.length; j++) {
                if (data[i].equals(in[j])) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue == true) {
                System.out.println(data[i]);
            }
        }
    }
}
