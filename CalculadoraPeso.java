import java.util.Scanner;

public class CalculadoraPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o peso atual da pessoa
        System.out.print("Digite o seu peso atual (em kg): ");
        double pesoAtual = scanner.nextDouble();

        // Calcular o peso com 15% de aumento
        double pesoAumento = pesoAtual * 1.15;

        // Calcular o peso com 20% de redução
        double pesoReducao = pesoAtual * 0.80;

        // Apresentar os resultados
        System.out.println("Seu peso atual é: " + pesoAtual + " kg");
        System.out.printf("Se você engordar 15%%, seu peso será: %.2f kg\n", pesoAumento);
        System.out.printf("Se você emagrecer 20%%, seu peso será: %.2f kg", pesoReducao);
    }
}