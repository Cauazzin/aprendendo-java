package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Switch Case (Escolha Caso)
        System.out.println("Digite o número do dia da semana (1 a 7): ");
        byte diaSemana = scanner.nextByte();

        String resultado;

        switch (diaSemana){
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Dia inválido!";
                break;
        }
        System.out.println(resultado);
        scanner.close();
    }
}
