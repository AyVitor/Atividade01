import java.util.Scanner;
public class Numeroum{

   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a, c;
    
            for (c = 1; c <= 3; c++) {
                System.out.print("\n\nDigite um número: ");
                a = scanner.nextInt();
                System.out.println("Dobro: " + dob(a));
            }
    
            System.out.println();
            scanner.close();
        }
    
        public static int dob(int num) {
            return num * 2;
        }
    }
    
