import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Converter para Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Apresentar o resultado
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.", celsius, fahrenheit);
    }
}