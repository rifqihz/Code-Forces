    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            int y = input.nextInt();
            String x;
            for (int i = 0; i < y; i++) {
                x = input.next();
                if("po".equals(x.substring(x.length()-2, x.length()))){                
                    System.out.println("FILIPINO");
                }else if("desu".equals(x.substring(x.length()-4, x.length())) || "masu".equals(x.substring(x.length()-4, x.length()))){                
                    System.out.println("JAPANESE");
                }else if("mnida".equals(x.substring(x.length()-5, x.length()))){                
                    System.out.println("KOREAN");
                }
            }
            
            
        }
        
    }
