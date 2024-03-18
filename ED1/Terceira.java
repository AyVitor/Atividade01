package ED1;


    import java.util.Scanner;

public class Terceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L, num;
        String[] nomes = new String[5];

        // Entrada dos nomes
        for (L = 0; L <= 4; L++) {
            System.out.print("\nNome " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();
        }

        
        System.out.print("\nDigite o número da pessoa: ");
        num = scanner.nextInt();

        
        while (num < 1 || num > 5) {
            System.out.println("\nNúmero fora do intervalo");
            System.out.print("Digite o número da pessoa: ");
            num = scanner.nextInt();
        }

        
        System.out.println("\n" + nomes[num - 1]);

        scanner.close();
    }
}


