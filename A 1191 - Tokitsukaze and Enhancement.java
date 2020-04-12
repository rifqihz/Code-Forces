import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0;        
        switch (x % 4) {
            case 1:
                System.out.println(count + " " + "A");
                break;
            case 2:
                count = 1;
                System.out.println(count + " " + "B");
                break;
            case 3:
                count = 2;
                System.out.println(count + " " + "A");
                break;
            case 0:
                count = 1;
                System.out.println(count + " " + "A");
                break;
        }
    }

}
