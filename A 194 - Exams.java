import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n,k;
        n = input.nextInt();
        k = input.nextInt();
        
        if( k >= 3*n ){
            System.out.println(0);
        }else if(k >2*n){
            System.out.println(3*n -k);
        }else if(k == 2*n){
            System.out.println(n);
        }
    }
}
