import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os valores dos catetos
        System.out.print("Digite o valor do primeiro cateto: ");
        double catetoA = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double catetoB = scanner.nextDouble();

        // Calcular a hipotenusa usando o Teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        // Apresentar o resultado
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}