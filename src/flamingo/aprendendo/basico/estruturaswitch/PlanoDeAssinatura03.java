package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class PlanoDeAssinatura03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int plano, meses;
        double valor, desconto, valorFinal;
        String nomePlano;

        System.out.print("Digite o plano (1-Básico, 2-Profissional, 3-Premium): ");
        plano = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        meses = scanner.nextInt();

        switch (plano) {

            case 1:
                nomePlano = "Básico";
                valor = meses * 29.90;
                break;

            case 2:
                nomePlano = "Profissional";
                valor = meses * 59.90;
                break;

            case 3:
                nomePlano = "Premium";
                valor = meses * 99.90;
                break;

            default:
                System.out.println("Plano inválido");
                return;
        }

        desconto = 0;

        if (meses == 12) {
            desconto = valor * 0.10;
        }

        valorFinal = valor - desconto;

        System.out.println("Plano escolhido: " + nomePlano
                + "\nMeses contratados: " + meses
                + "\nDesconto aplicado: " + (meses == 12 ? "10%" : "0%")
                + "\nValor final: R$ " + valorFinal);

        scanner.close();
    }

}
