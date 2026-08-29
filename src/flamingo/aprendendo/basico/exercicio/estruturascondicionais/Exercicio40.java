package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio40 {
    public static void main(String[] args) {

        double salario = 2800;

        double bonus = salario < 3000 ? 500 : 200;

        System.out.println("Bônus: R$ " + bonus);
    }
}
