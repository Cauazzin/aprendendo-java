package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio44 {
    public static void main(String[] args) {

        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = false;

        if (emailCorreto && senhaCorreta && contaAtiva) {
            System.out.println("Login realizado");
        } else if (!emailCorreto || !senhaCorreta) {
            System.out.println("Dados inválidos");
        } else {
            System.out.println("Conta bloqueada");
        }
    }
}
