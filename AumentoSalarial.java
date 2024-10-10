import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salário atual
        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Calcular o aumento
        double aumento = salarioAtual * 0.25; // 25% de aumento

        // Calcular o novo salário
        double novoSalario = salarioAtual + aumento;

        // Imprimir o novo salário
        System.out.printf("O novo salário é: R$ %.2f", novoSalario);
    }
}
