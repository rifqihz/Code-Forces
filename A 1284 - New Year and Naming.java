import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[input.nextInt()];
        String[] data2 = new String[input.nextInt()];

        input.nextLine();

        for (int i = 0; i < data.length; i++) {
            data[i] = input.next();
        }
        for (int i = 0; i < data2.length; i++) {
            data2[i] = input.next();
        }

        int x, y;
        String result;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            y = x;
            
                
            if (x % data.length == 0) {
                result = data [data.length-1];
            } else {
                x = x % data.length;            
                result = data[x - 1];
            }
                
            
            if (y % data2.length == 0) {
                result = result + data2[data2.length - 1 ];
            }else{
                y = y % data2.length;
                result = result + data2[y - 1];
            }

            System.out.println(result);
        }

    }
}
