package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoParte01 {
    static void main(String[] args) {
        // for
        // while
        // do while

        // contador = contador + 1
        // contador += 1
        // contador++

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10;i++){
            System.out.println(numero + " x "+ i + " = " + (numero * i));
        }
    }
}
