
    import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int[] numl = new int[5];
        int flag = 0, flagl = 0, op;

        for (int L = 0; L < 5; L++) {
            num[L] = 0;
            numl[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println("\nVETORES\n");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("\nOPÇÃO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(numl, 5, "B");
                    flagl = 1;
                    break;
                case 3:
                    if (flag != 0 && flagl != 0) {
                        imprime(num, 5, "A");
                        imprime(numl, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flagl != 0) {
                        soma(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flagl != 0) {
                        subtrai(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (op != 6);

        System.out.println();
        scanner.close();
    }

    public static void entrada(int[] vetor, int tam, String nome) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite os dados do VETOR " + nome + ":");
        for (int i = 0; i < tam; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprime(int[] vetor, int tam, String nome) {
        System.out.println("\nVETOR " + nome + ":");
        for (int i = 0; i < tam; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void soma(int[] vetor1, int[] vetor2, int tam) {
        int[] resultado = new int[tam];
        System.out.println("\nSoma dos VETORES:");
        for (int i = 0; i < tam; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
            System.out.print(resultado[i] + " ");
        }
        System.out.println(vetor1);
    }

    public static void subtrai(int[] vetor1, int[] vetor2, int tam) {
        int[] resultado = new int[tam];
        System.out.println("\nSubtração dos VETORES:");
        for (int i = 0; i < tam; i++) {
            resultado[i] = vetor1[i] - vetor2[i];
            System.out.print(resultado[i] + " ");
        }
        System.out.println(resultado);
    }
}

