import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as medidas das diagonais
        System.out.print("Digite o valor da diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Digite o valor da diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();

        // Calcular a área do losango
        double area = (diagonalMaior * diagonalMenor) / 2;

        // Apresentar o resultado
        System.out.printf("A área do losango é: %.2f unidades de área", area);
    }
}