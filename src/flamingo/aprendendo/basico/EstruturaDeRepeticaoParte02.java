package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoParte02 {
    static void main(String[] args) {
        // for
         // while
        // do while
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero *i));
            i++;
        }
        }
    }

