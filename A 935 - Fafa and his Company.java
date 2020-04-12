import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int count = 0;
        for (int i = 1; i < x; i++) {
            if((x-i) % i == 0){
                count++;
            }            
        }
        System.out.println(count);
    }
}
