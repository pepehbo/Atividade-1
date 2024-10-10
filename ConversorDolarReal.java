import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a cotação do dólar
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();

        // Solicitar o valor em dólares
        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        // Calcular o valor em reais
        double valorReal = valorDolar * cotacaoDolar;

        // Imprimir o resultado
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}