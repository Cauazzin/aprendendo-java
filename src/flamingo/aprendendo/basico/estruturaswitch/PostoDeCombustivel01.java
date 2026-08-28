package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class PostoDeCombustivel01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tipoCombustivel;
        double litros, valorTotal;
        String combustivel;

        System.out.print("Digite o tipo de combustível (1-Gasolina, 2-Etanol, 3-Diesel): ");
        tipoCombustivel = scanner.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        litros = scanner.nextDouble();

        switch (tipoCombustivel) {

            case 1:
                combustivel = "Gasolina";
                valorTotal = litros * 5.89;
                break;

            case 2:
                combustivel = "Etanol";
                valorTotal = litros * 3.99;
                break;

            case 3:
                combustivel = "Diesel";
                valorTotal = litros * 6.19;
                break;

            default:
                System.out.println("Tipo de combustível inválido");
                return;
        }

        System.out.println("Combustível escolhido: " + combustivel
                + "\nLitros abastecidos: " + litros
                + "\nValor total: R$ " + valorTotal);

        scanner.close();
    }
}

