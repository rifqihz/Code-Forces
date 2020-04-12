import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data [i] = input.nextInt();
        }
        
        for (int i = data[1]-data[2] - 1; i <= data[1]+data[2]+1 ; i++) {
            
            if(i < 1){
                continue;
            }else if(i > data [0]){
                continue;
            }            
            
            
            else if(i == data [1]){
                System.out.print("(" + data[1] + ")" );
            }else if(i == data[1]-data[2] -1 ){
                System.out.print("<<");
            }else if(i == data [1]+data[2] + 1){
                System.out.print(">>");
            }else if(i == data[0]){
                System.out.print(" " + data[0]);
                break;            
            }else{
                System.out.print(" " + i + " ");
            }
        }
    }
}
