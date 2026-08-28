package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class LojaDeRoupas05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tipoProduto, quantidade;
        double valor, desconto, valorFinal;
        String produto;

        System.out.print("Digite o produto (1-Camiseta, 2-Calça, 3-Jaqueta, 4-Tênis): ");
        tipoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        switch (tipoProduto) {

            case 1:
                produto = "Camiseta";
                valor = quantidade * 49.90;
                break;

            case 2:
                produto = "Calça";
                valor = quantidade * 119.90;
                break;

            case 3:
                produto = "Jaqueta";
                valor = quantidade * 199.90;
                break;

            case 4:
                produto = "Tênis";
                valor = quantidade * 249.90;
                break;

            default:
                System.out.println("Produto inválido");
                return;
        }

        desconto = 0;

        if (quantidade >= 3) {
            desconto = valor * 0.15;
        }

        valorFinal = valor - desconto;

        System.out.println("Produto escolhido: " + produto
                + "\nQuantidade: " + quantidade
                + "\nDesconto aplicado: " + (quantidade >= 3 ? "15%" : "0%")
                + "\nValor final: R$ " + valorFinal);

        scanner.close();
    }
}
