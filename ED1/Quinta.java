package ED1;
 import java.util.Scanner;

public class Quinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precoCompra = new double[100];
        double[] precoVenda = new double[100];
        double lucro;
        int totLucroMenor10 = 0;
        int totLucroMenor20 = 0;
        int totLucroMaior20 = 0;
        int A;

        
        for (A = 0; A < 100; A++) {
            System.out.print("\nPreço de compra: ");
            precoCompra[A] = scanner.nextDouble();
            System.out.print("Preço de venda: ");
            precoVenda[A] = scanner.nextDouble();
        }

        
        for (A = 0; A < 100; A++) {
            lucro = precoVenda[A] - precoCompra[A];
            if (lucro < 10.0) {
                totLucroMenor10++;
            } else if (lucro <= 20.0) {
                totLucroMenor20++;
            } else {
                totLucroMaior20++;
            }
        }

       
        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);

        scanner.close();
    }

 
    
}
