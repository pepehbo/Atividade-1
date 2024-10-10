import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        // Solicitar o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();

        // Calcular a quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        // Apresentar o resultado
        System.out.printf("O funcionário recebe %.2f salários mínimos.", quantidadeSalariosMinimos);
    }
}