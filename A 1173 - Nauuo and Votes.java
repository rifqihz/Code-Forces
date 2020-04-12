import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a == 0 && b == 0 && c != 0) {
            System.out.println('?');
        }else{
        if(c != 0){
        if (Math.abs(a - b) <= c) {
            System.out.println('?');
        } else if (Math.abs(a - b) > c) {
            if(a-b > 0){
            System.out.println('+');
            } else if(a-b < 0){
                System.out.println('-');
            }else if (a == b){
                System.out.println('0');            
            }
        } 
        
       
        }else{
            if(a > b){
                System.out.println('+');
            }else if(a < b){
                System.out.println('-');
            }else if (a == b){
                System.out.println('0');
            }
        }
        }

    }
}
