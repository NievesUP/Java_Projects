/*
 * Ejercicio 5: ¡vamos al parque acuático!
 *
 *
 *@author Nieves Urbano Polo
 */
package tarea01;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes 
        final double ENTRADA_INFANTIL = 10.00;
        final double ENTRADA_ADULTO = 15.00;

        // Variables de entrada 
        int numeroEntradasInfantil;
        int numeroEntradasAdulto;

        // Variables de salida 
        double costeSinDescuento;
        double costeConDescuento;
        double costeTotalIVA;

        // Variables auxiliares
        String mensaje = "No procede descuento en esta compra.";

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 5: ¡vamos al parque acuático!");
        System.out.println("--------------------");

        System.out.println("Introduce la cantidad de entradas DE ADULTO que desea adquirir:");          // mostramos un mensaje sobre la información que vamos a pedir por teclado
        numeroEntradasAdulto = teclado.nextInt();                                                     // a través del Scanner pedimos al usuario que escriba el número de entradas tipo ADULTO

        System.out.println("Introduce la cantidad de entradas INFANTILES que desea adquirir:");          // mostramos un mensaje sobre la información que vamos a pedir por teclado
        numeroEntradasInfantil = teclado.nextInt();                                                     // a través del Scanner pedimos al usuario que escriba el número de entradas tipo INFANTIL

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        costeSinDescuento = (numeroEntradasAdulto * ENTRADA_ADULTO) + (numeroEntradasInfantil * ENTRADA_INFANTIL);

        costeConDescuento = (costeSinDescuento >= 50 && costeSinDescuento < 100) ? costeSinDescuento - (costeSinDescuento * 0.05) : (costeSinDescuento >= 100) ? (costeSinDescuento - (costeSinDescuento * 0.15)) : costeSinDescuento;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Se comprarán " + numeroEntradasAdulto + " entradas de tipo ADULTO y " + numeroEntradasInfantil + " entradas de tipo INFANTIL.");
        System.out.printf("El coste de la entrada antes de aplicar descuentos es %.2f € %n", costeSinDescuento);
        mensaje = (costeSinDescuento >= 50 && costeSinDescuento < 100) ? "Se aplicará un descuento del 5%" : (costeSinDescuento >= 100) ? "Se aplicará un descuento del 15%" : mensaje;
        System.out.println(mensaje);
        System.out.printf("Tras aplicar posibles descuentos el coste total de las entradas (SIN IVA) es de %.2f € %n", costeConDescuento);
       costeTotalIVA = costeConDescuento + (costeConDescuento * 0.21);
        System.out.printf("El importe IVA incluido es de %.2f € %n", costeTotalIVA);
        System.out.println ("La cantidad final a pagar por el cliente es de " + (int)costeTotalIVA + " €");
        System.out.println();
        System.out.println("Fin del programa.");

    }

}
