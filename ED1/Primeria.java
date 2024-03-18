package ED1;


 
 import java.util.Scanner;   

public class Primeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int op, x, tam;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nDigite uma frase:");
                    scanner.nextLine(); 
                    frase = scanner.nextLine();
                    System.out.println("Numero de caracteres da frase: " + frase.length());
                    break;
                case 2:
                    System.out.println("\nDigite uma frase:");
                    scanner.nextLine(); 
                    frase = scanner.nextLine();
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    tam = frase.length() - 2;
                    System.out.println("Os dois ultimos caracteres: " + frase.substring(tam));
                    break;
                case 3:
                    System.out.println("\nDigite uma frase:");
                    scanner.nextLine(); 
                    frase = scanner.nextLine();
                    System.out.print("Frase espelhada: ");
                    for (x = frase.length() - 1; x >= 0; x--) {
                        System.out.print(frase.charAt(x));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nFim do algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao nao disponivel");
                    break;
            }

            System.out.println("\n");
        } while (op != 4);

        scanner.close();
    }
}
