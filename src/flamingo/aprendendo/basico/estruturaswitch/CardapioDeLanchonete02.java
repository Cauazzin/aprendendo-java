package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class CardapioDeLanchonete02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcaoLanche, quantidade;
        double total;
        String lanche;

        System.out.print("Digite a opção do lanche (1 a 5): ");
        opcaoLanche = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        switch (opcaoLanche) {

            case 1:
                lanche = "Hambúrguer";
                total = quantidade * 25.00;
                break;

            case 2:
                lanche = "Pizza";
                total = quantidade * 40.00;
                break;

            case 3:
                lanche = "Batata frita";
                total = quantidade * 18.00;
                break;

            case 4:
                lanche = "Refrigerante";
                total = quantidade * 8.00;
                break;

            case 5:
                lanche = "Suco";
                total = quantidade * 10.00;
                break;

            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Item escolhido: " + lanche
                + "\nQuantidade: " + quantidade
                + "\nTotal do pedido: R$ " + total);

        scanner.close();
    }
}
