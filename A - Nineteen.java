    import java.util.Scanner;
     
    public class Main {
     
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String data = input.nextLine();
     
            data = data.toLowerCase();
            char [] simpan = data.toCharArray();        
            int countN = 0, countT = 0, countI = 0, countE = 0,end = 0;
            for (int i = 0; i < simpan.length; i++) {
                if (simpan[i] == 'n') {
                    countN++;                
                }
                if (simpan[i] == 't') {
                    countT++;
                }
                if (simpan[i] == 'i') {
                    countI++;
                }
                if (simpan[i] == 'e') {
                    countE++;
                }
     
            }
            
            while(countN >= 3 && countT >= 1 && countE >= 3 && countI >= 1 ){
                end++;
                countN -= 2;
                countT -= 1;
                countE -= 3;
                countI -= 1;
            }
            
            System.out.println(end);
        }
     
    }
