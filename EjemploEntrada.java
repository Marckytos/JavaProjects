import java.util.Scanner;

public class EjemploEntrada {
     public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String entrada="";
        entrada = teclado.nextLine();
        System.out.println(entrada);
        String[] separado= entrada.split("");

        for (int i = 0; i < separado.length; i++) {
            System.out.println(separado[i]);
        }

    }
}