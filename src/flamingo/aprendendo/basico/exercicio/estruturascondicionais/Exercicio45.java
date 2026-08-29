package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio45 {
    public static void main(String[] args) {

        double valorCompra = 350;
        double desconto = 0;

        if (valorCompra <= 100) {
            desconto = 0;
        } else if (valorCompra <= 300) {
            desconto = 5;
        } else if (valorCompra <= 500) {
            desconto = 10;
        } else {
            desconto = 15;
        }

        double valorDesconto = valorCompra * desconto / 100;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}
