package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    static void main(String[] args) {

        /*
         byte idade = 17;

        if (idade >= 18) {
            System.out.println("Pode comprar bebida alcoólica");
        }else {
            System.out.println("Não pode comprar bebida alcoólica");
        } */

        byte idade = 19;
        String categoria;

        // < 15 - infantil
        // >= 15 && < 18 - Juvenil
        // >= 18 - Adulto

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
