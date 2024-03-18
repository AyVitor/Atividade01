 
    import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];

        
        for (int L = 0; L < 10; L++) {
            System.out.print("Digite uma palavra em letras minúsculas: ");
            nome[L] = scanner.nextLine();
            restantes(nome[L], nome[L].length(), "c");
        }

        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }

        System.out.println();
        scanner.close();
    }

    public static void restantes(String palavra, int tam, String padrao) {
        int resto = 10 - tam;
        if (padrao.equals("c")) {
            for (int i = 0; i < resto; i++) {
                palavra += 'c';
            }
        }
    }
}


