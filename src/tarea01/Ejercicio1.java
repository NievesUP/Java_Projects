/*
 * Ejercicio 1: cálculo del volumen de un cilindro.
 *
 *
 *@author Nieves Urbano Polo
 */
package tarea01;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final double PI = 3.1415927;

        // Variables de entrada 
        double radio;
        double altura;

        // Variables de salida 
        double resultadoVolumen;

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 1: cálculo del volumen de un cilindro");
        System.out.println("--------------------");

        System.out.println("Introduce el radio del cilindro:");          // mostramos un mensaje sobre la información que vamos a pedir por teclado
        radio = teclado.nextDouble();                                    // a través del Scanner pedimos al usuario que escriba el radio del cilindro

        System.out.println("Introduce la altura del cilindro:");       // mostramos un mensaje sobre la información que vamos a pedir por teclado
        altura = teclado.nextDouble();                               // a través del Scanner pedimos al usuario que escriba la altura del cilindro

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        resultadoVolumen = PI * (radio * radio) * altura;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.printf("El volumen de un cilindro de radio %.2f y altura %.2f es: %.2f%n", radio, altura, resultadoVolumen);  //mostramos valores con dos decimales
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
