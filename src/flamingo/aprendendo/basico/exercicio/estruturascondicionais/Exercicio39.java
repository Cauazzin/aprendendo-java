package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio39 {
    public static void main(String[] args) {

        double valorCompra = 120;

        double frete = valorCompra >= 150 ? 0 : 20;

        System.out.println("Frete: R$ " + frete);
    }
}
