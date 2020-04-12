import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String y;
        int total = 0;
        for (int i = 0; i < x; i++) {
            y = input.next();

            switch (y) {
                case "Tetrahedron":
                    total = total + 4;
                    break;
                case "Cube":
                    total = total + 6;
                    break;
                case "Octahedron":
                    total = total + 8;
                    break;
                case "Dodecahedron":
                    total = total + 12;
                    break;
                case "Icosahedron":
                    total = total + 20;
                    break;
            }
        }
        
        System.out.println(total);
    }
}
