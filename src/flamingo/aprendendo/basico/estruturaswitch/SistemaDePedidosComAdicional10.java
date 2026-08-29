package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class SistemaDePedidosComAdicional10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int produto, quantidade;
        boolean temAdicional;
        double valorProduto = 0, valorFinal;
        String nomeProduto = "", adicional, mensagem;

        System.out.print("Escolha o produto (1-Açaí, 2-Sorvete, 3-Milkshake): ");
        produto = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        System.out.print("Tem adicional? (true ou false): ");
        temAdicional = scanner.nextBoolean();

        switch (produto) {

            case 1:
                nomeProduto = "Açaí";
                valorProduto = 18;
                break;

            case 2:
                nomeProduto = "Sorvete";
                valorProduto = 12;
                break;

            case 3:
                nomeProduto = "Milkshake";
                valorProduto = 20;
                break;

            default:
                System.out.println("Produto inválido");
                scanner.close();
                return;
        }

        valorFinal = valorProduto * quantidade;

        if (temAdicional) {
            valorFinal += quantidade * 5;
            adicional = "Sim";
        } else {
            adicional = "Não";
        }

        mensagem = "Produto escolhido: " + nomeProduto +
                "\nQuantidade: " + quantidade +
                "\nAdicional: " + adicional +
                "\nValor total: R$ " + valorFinal;

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
