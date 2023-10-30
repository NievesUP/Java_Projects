/*
 * Ejercicio 4: gestión de recursos hídricos.
 *
 *
 *@author Nieves Urbano Polo
 */
package tarea01;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes 
        final int CAPACIDAD_MAX = 2000;

        // Variables de entrada 
        double volumenEmbalsado;                            // volumen actual de agua que hay en el embalse

        // Variables de salida 
        double porcentajeEmbalsado;                        // porcentaje actual de agua respecto a la capacidad máxima
        double diferenciaCapacidadMaxima;                  // diferencia entre capacidad máxima y volumen actual
        double volumenTrasLiberacion;                      // si hay liberación de agua, volumen tras la liberación
        double volumenLiberado;                            // si hay liberación de agua, volumen que se ha liberado
        double porcentajeLiberado;                         // si hay liberación de agua, porcentaje de agua respecto a la capacidad máxima tras la liberación

        // Variables auxiliares
        String mensaje = "No es necesario considerar la liberación controlada de agua en este momento.";  // se mostrará si el agua embalsada es superior al 95%

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 4: gestión de recursos hídricos.");
        System.out.println("--------------------");

        System.out.println("Introduce el volumen actual de agua almacenada en el embalse (hectómetros cúbicos:");   // mostramos un mensaje sobre la información que vamos a pedir por teclado
        volumenEmbalsado = teclado.nextDouble();                                                     // a través del Scanner pedimos al usuario que escriba el volumen actual de agua del embalse

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        diferenciaCapacidadMaxima = CAPACIDAD_MAX - volumenEmbalsado;
        System.out.printf("Faltan %.2f hectómetros cúbicos para llenar completamente el embalse.%n", diferenciaCapacidadMaxima);  // mostramos valores con dos decimales

        porcentajeEmbalsado = (volumenEmbalsado / CAPACIDAD_MAX) * 100;
        System.out.printf("El embalse está a un %.2f%% de su capacidad máxima.%n", porcentajeEmbalsado);  // mostramos valores con dos decimales

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        volumenTrasLiberacion = volumenEmbalsado - (0.1 * volumenEmbalsado);
        volumenLiberado = volumenEmbalsado - volumenTrasLiberacion;
        porcentajeLiberado = (volumenTrasLiberacion / CAPACIDAD_MAX) * 100;

        mensaje = (porcentajeEmbalsado < 95) ? mensaje : "Se ha realizado una liberación del 10.0% vaciando un total de " + volumenLiberado + " hectómetros cúbicos.\nEn el embalse quedan ahora " + volumenTrasLiberacion + " hectómetros cúbicos, que representan un " + porcentajeLiberado + "% de su capacidad máxima.";
        System.out.println(mensaje);

        System.out.println();
        System.out.println("Fin del programa.");
    }

}
