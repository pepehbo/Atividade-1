import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as notas ao usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Apresentar o resultado
        System.out.println("A média aritmética é: " + media);
    }
}