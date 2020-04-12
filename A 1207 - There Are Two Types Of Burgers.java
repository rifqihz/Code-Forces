import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] data = new int[n*2][3];

        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = input.nextInt();
                }                
            } else {            
                for (int j = 0; j < 2; j++) {
                    data[i][j] = input.nextInt();
                }
                
            }            
        }
        boolean a = true;
        int hasil,count = 0;
        for (int i = 1; i < data.length;) {            
            hasil = 0;
            if (i % 2 == 1) {
                for (int j = 0; j < 1; j++) {
                    a = data[i][j] > data[i][j + 1];
                }    
                i--;
            } else {
                if (a == true) {
                    while (data[i][0] >= 2 && (data[i][1] >= 1 || data[i][2] >= 1)) {
                        if (data[i][0] >= 2 && data[i][1] >= 1) {
                            hasil = hasil + data[i + 1][0];
                            data[i][0] -= 2;
                            data[i][1]--;
                        } else if (data[i][0] >= 2 && data[i][2] >= 1) {
                            hasil = hasil + data[i + 1][1];
                            data[i][0] -= 2;
                            data[i][2]--;
                        }
                    }                    
                } else if (a == false) {
                    while (data[i][0] >= 2 && (data[i][1] >= 1 || data[i][2] >= 1)) {
                        if (data[i][0] >= 2 && data[i][2] >= 1) {
                            hasil = hasil + data[i + 1][1];
                            data[i][0] -= 2;
                            data[i][2]--;
                        } else if (data[i][0] >= 2 && data[i][1] >= 1) {
                            hasil = hasil + data[i + 1][0];
                            data[i][0] -= 2;
                            data[i][1]--;
                        }
                    }
                }
            i = i + 3;
            System.out.println(hasil);
            }
        }
        

    }

}
