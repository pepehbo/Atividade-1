import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número para gerar a tabuada
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Gerar e imprimir a tabuada
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}