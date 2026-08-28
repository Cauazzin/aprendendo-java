package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio08 {
    //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    //brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    //de eleitores.

    static void main(String[] args) {
        int totalEleitores;
        short votosBrancos, votosNulos, votosValidos;
        short porcentagemVotosBrancos, porcentagemVotosNulos, porcentagemVotosValidos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o total de eleitores dessa votação?");
        totalEleitores = sc.nextInt();

        System.out.println("Quantos votaram em branco?");
        votosBrancos = sc.nextShort();

        System.out.println("Quantos votaram nulo?");
        votosNulos = sc.nextShort();

        votosValidos = (short) (totalEleitores - (votosBrancos + votosNulos));

        porcentagemVotosNulos = (short) ((votosNulos * 100.0) / totalEleitores);
        porcentagemVotosBrancos = (short) ((votosBrancos * 100.0) / totalEleitores);
        porcentagemVotosValidos = (short) ((votosValidos * 100.0) / totalEleitores);


        System.out.printf("Nessa votação tivemos o total de %d eleitores. Onde:%n" +
                        "%d%% votaram em branco%n" +
                        "%d%% votaram em nulo%n" +
                        "E %d%% tiveram votos válidos.%n",
                totalEleitores, porcentagemVotosBrancos, porcentagemVotosNulos, porcentagemVotosValidos);

        sc.close();
    }
}
