package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class IngressoDeCinema08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tipoIngresso, quantidade;
        double valorIngresso = 0, valorFinal, desconto = 0;
        String nomeIngresso = "", mensagem;

        System.out.print("Escolha o tipo de ingresso (1-Inteira, 2-Meia, 3-VIP): ");
        tipoIngresso = scanner.nextInt();

        System.out.print("Digite a quantidade de ingressos: ");
        quantidade = scanner.nextInt();

        switch (tipoIngresso) {

            case 1:
                nomeIngresso = "Inteira";
                valorIngresso = 32;
                break;

            case 2:
                nomeIngresso = "Meia-entrada";
                valorIngresso = 16;
                break;

            case 3:
                nomeIngresso = "VIP";
                valorIngresso = 60;
                break;

            default:
                System.out.println("Tipo de ingresso inválido");
                scanner.close();
                return;
        }

        valorFinal = valorIngresso * quantidade;

        if (quantidade > 4) {
            desconto = valorFinal * 0.05;
            valorFinal -= desconto;
        }

        mensagem = "Tipo de ingresso: " + nomeIngresso +
                "\nQuantidade: " + quantidade +
                "\nDesconto aplicado: " + (quantidade > 4 ? "5%" : "0%") +
                "\nValor final: R$ " + valorFinal;

        System.out.println("\n" + mensagem);

        scanner.close();
    }

}
