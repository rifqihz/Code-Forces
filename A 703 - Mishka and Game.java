import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] [] data = new int [input.nextInt()] [2];
        
        int m = 0,c = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data [i] [j] = input.nextInt();                                
            }            
        }
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 1; j++) {
                if(data [i][j] > data [i] [j+1]){
                    m++;
                }else if (data [i][j] < data [i] [j+1]) {
                    c++;
                }
            }
        }
        
        if(m == c){
            System.out.println("Friendship is magic!^^");
        }else{
        System.out.println(m > c ? "Mishka" : "Chris");
        }
    }
}
