package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio42 {
    public static void main(String[] args) {

        double saldo = 100;
        double valorProduto = 150;
        boolean clienteVip = true;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
