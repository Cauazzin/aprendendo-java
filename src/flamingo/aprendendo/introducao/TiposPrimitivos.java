package flamingo.aprendendo.introducao;

public class TiposPrimitivos {
    public static void main (String[] args) {
        // byte : -128 a 127
        // short : -32.768 a 32767
        // int : -2 bilhões a 2 bilhões
        // long : Para numeros inteiros muito grandes (usa um L no final do número)
        // float : Precisão simples (usa um f no final, ex: 5.5f)
        // double : Precisão dupla, sendo o padrão para decimais no Java
        // char : Guarda uma única letra ou símbolo em formato Unicode (ex: 'A').
        // boolean : Guarda apenas dois valores: true (verdadeiro) ou false (falso)
        byte idade = 19;
        int municipio = 114000000;
        long contaBancaria = 999999999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'C';
        boolean vaiEstudarNasFerias = false;
        System.out.println(vaiEstudarNasFerias);
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println("PL caiu = " + salarioExtra);
        System.out.println("Meu salario depois de estudar com o bigas é " + salario);
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " milhões de moradores." );
        System.out.println("Minha conta bancaria daqui a 5 anos " + contaBancaria);
    }
}
