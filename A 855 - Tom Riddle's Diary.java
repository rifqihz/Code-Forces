import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String [] data = new String [input.nextInt()];
        
        input.nextLine();
        boolean isTrue;
        for (int i = 0; i < data.length; i++) {
            isTrue = true;
            data [i] = input.next();
            for (int j = 0; j < data.length; j++) {
            if(i == j){
                continue;
            }else{
                if("".equals(data [j])){
                    break;
                }else{
                    if(data [i].equals(data [j])){
                        System.out.println("YES");
                        isTrue = false;
                        break;
                    }
                }
            }   
            }
            if(isTrue){
                System.out.println("NO");
            }
        }
    }
}
