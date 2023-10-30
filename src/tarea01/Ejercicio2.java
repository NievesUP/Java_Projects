/*
 * Ejercicio 2: operadores aritméticos.
 *
 *
 *@author Nieves Urbano Polo
 */
package tarea01;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada 
        int numero1;
        int numero2;
        int numero3;

        // Variables de salida 
        double resultado1;
        double resultado2;
        boolean resultado3;
        double resultado4;

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2: operadores aritméticos");
        System.out.println("--------------------");

        System.out.println("Introduce el primer número:");          // mostramos un mensaje sobre la información que vamos a pedir por teclado
        numero1 = teclado.nextInt();                                    // a través del Scanner pedimos al usuario que escriba el primer número

        System.out.println("Introduce el segundo número:");       // mostramos un mensaje sobre la información que vamos a pedir por teclado
        numero2 = teclado.nextInt();                               // a través del Scanner pedimos al usuario que escriba el segundo número

        System.out.println("Introduce el tercer número:");       // mostramos un mensaje sobre la información que vamos a pedir por teclado
        numero3 = teclado.nextInt();                               // a través del Scanner pedimos al usuario que escriba el tercer número

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        resultado1 = (((double)numero1 / 3) + ((double)numero3 / 2));
        resultado2 = (((double)numero2 + (double)numero3) / 2) * (((double)numero2 + (double)numero3) / 2);
        resultado3 = (((numero2 + numero3 - numero1) * 3) % 2) == 0;
        resultado4 = (((double)numero1+(double)numero2) * ((double)numero3-(double)numero1)) / (double)numero2;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El valor de un tercio del primer número más la mitad del tercer número: " +resultado1);
        System.out.println("El valor del cuadrado de la mitad de la suma del segundo número más el tercero: " +resultado2);
        System.out.println("Comprobamos si el triple de la suma del segundo más el tercer número menos el primero es par: " +resultado3);
        System.out.println("Valor de la suma del primero más el segundo, multiplicado por la diferencia del tercero menos el primero y todo ello partido por el segundo número: " +resultado4);
        System.out.println();
        System.out.println("Fin del programa.");

    }

}
