package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class CalculadoraSimples06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero01, numero02, resultado = 0;
        int operacao;
        String nomeOperacao = "";
        String mensagem;

        System.out.print("Digite o primeiro número: ");
        numero01 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero02 = scanner.nextDouble();

        System.out.print("Escolha a operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        operacao = scanner.nextInt();

        switch (operacao) {

            case 1:
                nomeOperacao = "Soma";
                resultado = numero01 + numero02;
                break;

            case 2:
                nomeOperacao = "Subtração";
                resultado = numero01 - numero02;
                break;

            case 3:
                nomeOperacao = "Multiplicação";
                resultado = numero01 * numero02;
                break;

            case 4:
                if (numero02 == 0) {
                    mensagem = "Não é possível dividir por zero";
                    System.out.println(mensagem);
                    scanner.close();
                    return;
                }
                nomeOperacao = "Divisão";
                resultado = numero01 / numero02;
                break;

            default:
                mensagem = "Operação inválida";
                System.out.println(mensagem);
                scanner.close();
                return;
        }

        mensagem = "Operação escolhida: " + nomeOperacao +
                "\nResultado: " + resultado;

        System.out.println(mensagem);

        scanner.close();
    }
}
