package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class FretePorRegiao07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int regiao;
        double valorProduto, frete = 0, valorFinal;
        String nomeRegiao = "", mensagem;

        System.out.print("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();

        System.out.print("Escolha a região (1-Sudeste, 2-Sul, 3-Nordeste, 4-Norte, 5-Centro-Oeste): ");
        regiao = scanner.nextInt();

        switch (regiao) {

            case 1:
                nomeRegiao = "Sudeste";
                frete = 20;
                break;

            case 2:
                nomeRegiao = "Sul";
                frete = 25;
                break;

            case 3:
                nomeRegiao = "Nordeste";
                frete = 35;
                break;

            case 4:
                nomeRegiao = "Norte";
                frete = 45;
                break;

            case 5:
                nomeRegiao = "Centro-Oeste";
                frete = 30;
                break;

            default:
                System.out.println("Região inválida");
                scanner.close();
                return;
        }

        if (valorProduto >= 300) {
            frete = 0;
        }

        valorFinal = valorProduto + frete;

        mensagem = "Região: " + nomeRegiao +
                "\nValor do produto: R$ " + valorProduto +
                "\nFrete: R$ " + frete +
                "\nValor final: R$ " + valorFinal;

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
