package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio30 {
    public static void main(String[] args) {

        int tipoCliente = 3;
        double valorCompra = 200;
        double desconto = 0;
        double valorFinal;

        if (tipoCliente == 1) {
            desconto = 0;
        } else if (tipoCliente == 2) {
            desconto = 0.05;
        } else if (tipoCliente == 3) {
            desconto = 0.10;
        } else if (tipoCliente == 4) {
            desconto = 0.15;
        }

        valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor final: R$ " + valorFinal);
    }
}
