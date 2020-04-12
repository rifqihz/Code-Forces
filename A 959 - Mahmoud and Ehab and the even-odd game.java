import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        if(x % 2 ==0) {
            System.out.println("Mahmoud");
        }else{
            System.out.println("Ehab");
        }
    }
}
