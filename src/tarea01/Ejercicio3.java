/*
 * Ejercicio 3: palabras circulares.
 *
 *
 *@author Nieves Urbano Polo
 */
package tarea01;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada 
        String palabra1;
        String palabra2;
        String palabra3;

        // Variables de salida 
        String resultado1;
        String resultado2;
        String resultado3;
        String resultado4;

        // Variables auxiliares
        int longitudPalabra1;
        int longitudPalabra2;
        int longitudPalabra3;

        char ultimaLetra1;
        char ultimaLetra2;
        char ultimaLetra3;

        char primeraLetra1;
        char primeraLetra2;
        char primeraLetra3;

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 3: palabras circulares.");
        System.out.println("--------------------");

        System.out.println("Introduce la PRIMERA palabra:");          // mostramos un mensaje sobre la información que vamos a pedir por teclado
        palabra1 = teclado.nextLine();                                    // a través del Scanner pedimos al usuario que escriba la primera palabra

        System.out.println("Introduce la SEGUNDA palabra:");       // mostramos un mensaje sobre la información que vamos a pedir por teclado
        palabra2 = teclado.nextLine();                              // a través del Scanner pedimos al usuario que escriba la segunda palabra

        System.out.println("Introduce la TERCERA palabra:");       // mostramos un mensaje sobre la información que vamos a pedir por teclado
        palabra3 = teclado.nextLine();                              // a través del Scanner pedimos al usuario que escriba la tercera palabra

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        longitudPalabra1 = palabra1.length();
        longitudPalabra2 = palabra2.length();
        longitudPalabra3 = palabra3.length();

        ultimaLetra1 = palabra1.toLowerCase().charAt(palabra1.length() - 1);       // para calcular longitud restamos -1 ya que la primera posición es 0
        ultimaLetra2 = palabra2.toLowerCase().charAt(palabra2.length() - 1);
        ultimaLetra3 = palabra3.toLowerCase().charAt(palabra3.length() - 1);

        primeraLetra1 = palabra1.toLowerCase().charAt(0);                           // JAVA es case sensitive, convertimos las letras a minúscula (o mayúscula)
        primeraLetra2 = palabra2.toLowerCase().charAt(0);
        primeraLetra3 = palabra3.toLowerCase().charAt(0);
        
        resultado1 = (longitudPalabra1 < 6 && longitudPalabra2 < 6 || longitudPalabra3 > 8 ) ? "SI" : "NO";
        resultado2 = (longitudPalabra2 > longitudPalabra1 && longitudPalabra2 > longitudPalabra3) ? "SI" : "NO";
        resultado3 = (ultimaLetra1 == primeraLetra2 && ultimaLetra2 == primeraLetra3) ? "SI" : "NO";
        resultado4 = (ultimaLetra1 == primeraLetra2 && ultimaLetra2 == primeraLetra3 && ultimaLetra3 == primeraLetra1) ? "SI" : "NO";

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("La longitud de las dos primeras palabras es menor de 6 o la longitud de la tercera es mayor de 8 caracteres: " + resultado1);
        System.out.println("La segunda palabra es la palabra de mayor longitud: " + resultado2);
        System.out.println("Las tres palabras introducidas son palabras encadenadas: : " + resultado3);
        System.out.println("Las tres palabras introducidas son palabras circulares: " + resultado4);
        System.out.println();
        System.out.println("Fin del programa.");
    }

}
