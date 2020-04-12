import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,m,k;
        
        n = input.nextInt();
        
        m = input.nextInt();
        
        k = input.nextInt();
        
        if(m >= n && k >= n  ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
