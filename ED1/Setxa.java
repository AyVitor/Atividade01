package ED1;


    import java.util.Scanner;

public class Setxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ultDia = new int[12];
        int data, dia, mes;
        String[] signo = new String[12];

        
        for (int i = 0; i < 12; i++) {
            System.out.print("\nDigite o signo: ");
            signo[i] = scanner.nextLine();
            System.out.print("Digite o último dia: ");
            ultDia[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

       
        System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
        data = scanner.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("\nSigno: " + signo[mes]);

            System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
            data = scanner.nextInt();
        }

        System.out.println();
        scanner.close();
    }
}

