import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String x = input.nextLine();
        int a = 0,b = 0,c = 0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == '|'){
                a++;                
            }else if(x.charAt(i) == '+'){
                b = a;
            }else if(x.charAt(i) == '='){
                c = a-b;
            }
        }
        
        a = a -b -c;        
        
        
            if(a < b+c){
                a++;
                b--;
            }else if (a> b + c){
                a--;
                b++;
            }
        
         
        if(a != b + c){
            System.out.println("Impossible");
        }else if(a == b+c){
            if(b == 0){
                c--;
                b++;
            }else if(c == 0){
                c++;
                b--;
            }
            for (int i = 0; i <= a+b+c +1; i++) {
                if(i < b)
                System.out.print("|");
                else if(i == b)
                System.out.print("+");
                else if(i<=b+c)
                System.out.print("|");
                else if(i == b + c + 1)
                System.out.print("=");
                else if(i > b+c)
                System.out.print("|");
            }
        }
        
        
        
    }
}
