package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio43 {
    public static void main(String[] args) {

        int idade = 18;
        boolean temCarteirinhaEstudante = true;

        if (idade < 12 || temCarteirinhaEstudante) {
            System.out.println("Paga meia entrada");
        } else {
            System.out.println("Paga entrada inteira");
        }
    }
}
