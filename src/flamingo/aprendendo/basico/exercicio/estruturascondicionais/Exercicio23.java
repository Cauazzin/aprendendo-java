package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio23 {
    public static void main(String[] args) {

        double salario = 3500;

        if (salario <= 1500) {
            System.out.println("Salário baixo");
        } else if (salario <= 3000) {
            System.out.println("Salário médio");
        } else if (salario <= 7000) {
            System.out.println("Salário bom");
        } else {
            System.out.println("Salário alto");
        }
    }
}
