import java.util.Scanner;

public class CalculadoraEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor do raio
        System.out.print("Digite o valor do raio da esfera: ");
        double raio = scanner.nextDouble();

        // Calcular o comprimento (circunferência)
        double comprimento = 2 * Math.PI * raio;

        // Calcular a área
        double area = Math.PI * Math.pow(raio, 2);

        // Calcular o volume
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        // Apresentar os resultados
        System.out.printf("Comprimento da esfera: %.2f unidades de comprimento\n", comprimento);
        System.out.printf("Área da esfera: %.2f unidades de área\n", area);
        System.out.printf("Volume da esfera: %.2f unidades de volume", volume);
    }
}