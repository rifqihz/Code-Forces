import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int save = 2 * (1 + x);
        for (int i = 2; i <= x / 2; i++) {
            int z;
            if(x % i == 0){
            z = 2 * (i + x / i);
            if (z < save) {
                save = z;
            }
            }        
        }
        System.out.println(save);

    }

}
