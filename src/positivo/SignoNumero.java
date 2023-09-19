package positivo;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * La versión del programa que se presenta a continuación añade un par de
 * sentencias if:
 * una comprueba si el número que se introduce es menor que cero, 
 * mientras que la otra comprueba si el número es igual a cero.
 *
 */

public class SignoNumero {

    public static void main(String args[]) {

        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();

        // comparar número con cero
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        }
        if (numero < 0) {
            System.out.println(numero + " es menor que cero");
        }
        if (numero == 0) {
            System.out.println(numero + " es igual que cero");
        }
    }

}
