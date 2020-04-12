import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,count;
        a = input.nextInt();
        b = input.nextInt();
        count = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            count++;
        }
        
        System.out.println(count);
    }
}
