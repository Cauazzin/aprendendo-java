package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class ServicoDeBanhoTosa09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tipoServico, porteAnimal;
        double valor = 0;
        String servico = "", porte = "", mensagem;

        System.out.print("Escolha o serviço (1-Banho, 2-Tosa, 3-Banho e Tosa): ");
        tipoServico = scanner.nextInt();

        System.out.print("Escolha o porte do animal (1-Pequeno, 2-Médio, 3-Grande): ");
        porteAnimal = scanner.nextInt();

        switch (tipoServico) {

            case 1:
                servico = "Banho";

                switch (porteAnimal) {
                    case 1:
                        porte = "Pequeno";
                        valor = 40;
                        break;
                    case 2:
                        porte = "Médio";
                        valor = 55;
                        break;
                    case 3:
                        porte = "Grande";
                        valor = 70;
                        break;
                    default:
                        System.out.println("Porte do animal inválido");
                        scanner.close();
                        return;
                }
                break;

            case 2:
                servico = "Tosa";

                switch (porteAnimal) {
                    case 1:
                        porte = "Pequeno";
                        valor = 50;
                        break;
                    case 2:
                        porte = "Médio";
                        valor = 65;
                        break;
                    case 3:
                        porte = "Grande";
                        valor = 80;
                        break;
                    default:
                        System.out.println("Porte do animal inválido");
                        scanner.close();
                        return;
                }
                break;

            case 3:
                servico = "Banho e Tosa";

                switch (porteAnimal) {
                    case 1:
                        porte = "Pequeno";
                        valor = 85;
                        break;
                    case 2:
                        porte = "Médio";
                        valor = 110;
                        break;
                    case 3:
                        porte = "Grande";
                        valor = 140;
                        break;
                    default:
                        System.out.println("Porte do animal inválido");
                        scanner.close();
                        return;
                }
                break;

            default:
                System.out.println("Serviço inválido");
                scanner.close();
                return;
        }

        mensagem = "Serviço escolhido: " + servico +
                "\nPorte do animal: " + porte +
                "\nValor total: R$ " + valor;

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
