import java.util.Scanner;

public class Metro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[2][input.nextInt()];

        int x = input.nextInt();
        
        boolean isFinish = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
            }
        }
        if (data[0][0] == 1) {
            for (int j = x - 1; j < data[0].length; j++) {
                if (j == x - 1) {
                    if (data[0][j] == 1) {
                        System.out.println("YES");
                        isFinish = true;
                        break;
                    } else if (data[1][j] == 0) {
                        System.out.println("NO");                       
                        isFinish = true;
                        break;
                    }
                } else if (data[0][j] == 1) {
                    if (data[1][j] == 1) {
                        System.out.println("YES");
                        isFinish = true;
                        break;
                    }                    
                }
            }
        } else {
            System.out.println("NO");
            isFinish = true;
        }
        if(isFinish == false){
            System.out.println("NO");
        }
    }
}
