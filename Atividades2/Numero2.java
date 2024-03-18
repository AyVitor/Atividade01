
import java.util.Scanner;

    public class Numero2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num, pri;
    
            System.out.print("Digite um número > 0: ");
            num = scanner.nextInt();
    
            pri = primo(num);
            if (pri == 0) {
                System.out.println(num + " é primo.");
            } else {
                System.out.println(num + " não é primo.");
            }
    
            System.out.println();
            
            scanner.close();
        }
    
        public static int primo(int num) {
            if (num <= 1) {
                return 1;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return 1;
                }
            }
            return 0;
        }
    }
    
    

