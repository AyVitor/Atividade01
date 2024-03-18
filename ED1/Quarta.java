package ED1;

import java.util.Scanner;

public class Quarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];

        // Trecho de entrada de 15 nomes
        for (L = 0; L <= 14; L++) {
            System.out.print("\n\nDigite " + (L + 1) + " nome: ");
            nomes[L] = scanner.nextLine();
            
            while (nomes[L].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres");
                System.out.print("\n\nDigite " + (L + 1) + " nome: ");
                nomes[L] = scanner.nextLine();
            }
            
            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++) {
                nomes[L] += " ";
            }
            
            System.out.print("Digite a 1ª nota: ");
            pr1[L] = scanner.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine();
            
            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);
            
            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }
        
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L <= 14; L++) {
            System.out.println((L + 1) + "- " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
       

        System.out.println();
        scanner.close();
    }
}

