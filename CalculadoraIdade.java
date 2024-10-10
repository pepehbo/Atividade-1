import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o ano de nascimento e o ano atual
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        // Calcular a idade atual
        int idadeAtual = anoAtual - anoNascimento;

        // Calcular a idade em 2050
        int idadeEm2050 = 2050 - anoNascimento;

        // Imprimir os resultados
        System.out.println("A idade da pessoa no ano atual é: " + idadeAtual + " anos.");
        System.out.println("A idade da pessoa em 2050 será: " + idadeEm2050 + " anos.");
    }
}