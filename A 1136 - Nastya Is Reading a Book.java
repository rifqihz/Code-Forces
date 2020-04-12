import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[input.nextInt()][2];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }        
        int x = input.nextInt();
        int count = data.length;

        for (int i = 0; i < data.length ; i++) {
            if (x <= data[i][1]) {                
                count = count - i;
                break;
            }
        }
        System.out.println(count);
    }
}
