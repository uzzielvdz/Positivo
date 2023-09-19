package positivo;
import java.util.Scanner;

/**
 *
 * @author maryse
 * 
 * El programa selecciona el signo que tiene un número real.
 * 
 */

public class Positivo {

    public static void main(String[] args) {

        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();

        // comparar número con cero
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        }
    }

}
