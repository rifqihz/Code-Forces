import java.util.Scanner;

public class University_Classes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] data = new int [7];
        String x;
        long in = input.nextLong();
        input.nextLine();
        for (int i = 0; i < in; i++) {            
            x = input.nextLine();            
            for (int j = 0; j < 7; j++) {                                
                if (Character.getNumericValue(x.charAt(j)) == 1) {
                switch (j) {
                    case 0:
                        data[0]++;
                        break;
                    case 1 :
                        data[1]++;
                        break;
                    case 2:
                        data[2]++;
                        break;
                    case 3 :
                        data[3]++;
                        break;
                    case 4:
                        data[4]++;
                        break;
                    case 5 :
                        data[5]++;
                        break;
                    case 6:
                        data[6]++;
                        break;
                    
                }
            }

            }
        }
        int max  = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data [i] > max){
                max = data [i];
            }
        }
        System.out.println(max);
    }
}
