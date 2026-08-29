package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio29 {
    public static void main(String[] args) {

        double imc = 27;

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
