package ED1;


    import java.util.Scanner;

public class Segunda{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];

        
        for (L = 0; L <= 4; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º nome: ");
            nomes[L] = scanner.nextLine();
            System.out.print("Digite a 1ª nota: ");
            pr1[L] = scanner.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine(); 
            media[L] = (pr1[L] + pr2[L]) / 2;
        }
        

        
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L <= 4; L++) {
            System.out.println("\n" + (L + 1) + " - " + nomes[L]);
            System.out.println(pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }
       

        System.out.println();
        scanner.close();
    }
}

    

