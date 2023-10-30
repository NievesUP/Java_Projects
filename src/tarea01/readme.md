# Tarea 01

En esta carpeta, encontrarás cuatro ejercicios para completar como parte de la Tarea 01.

## Ejercicio 1

### Título:
Cálculo del volumen de un cilindro

### Descripción:
Realiza un programa Java que permita la introducción de dos números reales. Estos números representarán el radio de la circunferencia y la altura del cilindro. Una vez introducidos los números por teclado, el programa calculará el volumen de dicho cilindro siguiendo la fórmula indicada y escribirá por pantalla el resultado (debes mostrar el resultado presentando únicamente dos decimales).

Cilindro y fórmula de cálculo de su volumen
Licencia: Elaboración propia
Recuerda que, aparte del código que resuelva cada uno de los ejercicios propuestos en esta tarea, debes incluir también los comentarios mínimos necesarios para que otra persona que analice el código pueda seguirlo con facilidad. Recuerda que se trata de un recurso fundamental para mejorar la legibilidad de tu código.

IMPORTANTE: No debes utilizar métodos, estructuras o constantes predefinidas que NO se hayan visto aún en los contenidos de la Unidad 1 (más adelante sí podremos utilizarlos, pero en esta unidad no está permitido). Puedes definir PI como una constante con el valor 3,1415927.

## Ejercicio 2

### Título:
Operadores aritméticos

### Descripción:
Realiza un programa Java que permita la introducción de tres números enteros. El programa realizará los cálculos necesarios para determinar:

un tercio del primer número más la mitad del tercer número.
el cuadrado de la mitad de la suma del segundo número más el tercero.
si el triple de la suma del segundo más el tercer número menos el primero es par.
la suma del primero más el segundo, multiplicado por la diferencia del tercero menos el primero y todo ello partido por el segundo número.
Para realizar estas comprobaciones dispones de operadores relacionales tales como igual (==), menor que (<), mayor que (>), etc. Ten en cuenta que el resultado de la aplicación de operadores relacionales será un valor de tipo boolean, es decir un valor que será true o false.

Recuerda también que puedes obtener el resto de una división entera entre dos números utilizando el operador módulo (%). Este operador también te puede ayudar para determinar si un número es divisible entre otro (si el resultado la división a%b es igual a 0, significara que a es divisible entre b).

Recomendación
Recuerda que, en Java, si en una división el numerador y el denominador son valores enteros el resultado de la operación será otro valor entero (sin decimales). Así, por ejemplo, la división del valor 7 entre el valor 2 dará un resultado 3 que corresponde al cociente entero de dicha división. Si queremos obtener el resultado exacto de la división (con todos sus decimales) será necesario aplicar operaciones de conversión de tipos. Para obtener más información consulta el apartado 12 en los contenidos de la Unidad.

Nota: Ten en cuenta que para resolver el ejercicio solo podrás utilizar operadores que hayamos visto durante esta unidad. No podrás utilizar métodos de otras clases que aún no hemos visto en los contenidos. En el caso de las divisiones, no es necesario que tengas en cuenta y controles los errores que pueden ocurrir al dividir entre 0, símplemente usa otros números (más adelante nos ocuparemos de eso).

## Ejercicio 3

### Título:
Palabras circulares

### Descripción:
Realiza un programa en Java que permita introducir por teclado tres palabras. Una vez introducidas las palabras, se realizarán las comprobaciones necesarias para determinar:

Si las dos primeras palabras introducidas tienen menos de 6 caracteres o la tercera palabra tiene más de 8 caracteres.
Si la segunda palabra es la de mayor longitud de las tres.
Si las tres palabras están encadenadas (la última letra de una palabra es igual a la primera letra de la palabra siguiente) o no.
Si se trata de palabras circulares (palabras encadenadas en la que la última letra de la última palabra también coincide con la primera letra de la primera palabra) o no.
Observa que las respuestas a cada una de las 4 cuestiones anteriores debe ser SI o NO (según se cumpla o no la situación descrita en cada apartado). Puedes conseguir este comportamiento apoyándote en uno de los operadores vistos en la unidad.

IMPORTANTE: No debes utilizar estructuras de selección (if-else) puesto que aún no se han tratado en esta Unidad (más adelante sí podremos utilizarlos, pero en esta unidad no está permitido).

Nota: para la determinación de palabras encadenadas o circulares no tengas en cuenta si los caracteres están escritos en mayúsculas o minúsculas. Así, por ejemplo, las palabras Ordenador -> Ratón se considerarían palabras encadenadas aunque en la primera palabra la 'r' sea minúscula y en la segunda palabra la 'R' sea mayúscula.

## Ejercicio 4

### Título:
Gestión de recursos hídricos

### Descripción:
Diseña un programa en Java que permita monitorizar el nivel de agua de un embalse. El embalse tiene una capacidad fija máxima de 2.000 hm3 (hectómetros cúbicos).

El usuario deberá introducir por el teclado el volumen de agua embalsada en un momento determinado. A partir de esa cantidad, el programa calculará la cantidad de hectómetros cúbicos de agua que son necesarios para que el embalse se llene completamente. Igualmente, se calculará el porcentaje que corresponde la cantidad de agua embalsada respecto a la capacidad total del embalse.

Si el porcentaje actual de agua embalsada es superior al 95% de la capacidad total del embalse se realizará una liberación controlada de agua de un 10% del volumen de agua embalsada.
En este caso, se debe informar al usuario del porcentaje de liberación que se ha realizado, de cuántos hectómetros cúbicos se han vaciado en esa operación, cual es el volumen actual del depósito, y cuál es el porcentaje actual.

Por contra, si el porcentaje actual del embalse es inferior al 95% no se realizará ningún tipo de liberación. En este caso simplemente se mostrará el mensaje "No es necesario considerar la liberación controlada de agua en este momento."

IMPORTANTE: Recuerda que el uso de métodos o estructuras que NO se han visto aún en los contenidos de la Unidad 1 está prohibido (más adelante sí podremos utilizarlos, pero en esta unidad no está permitido ya que, en esta limitación, se encuentra parte de la dificultad del ejercicio).

Recomendación
Una vez se realice la evaluación del operador ternario para la distinción de los posibles casos que se plantean en el problema te recomendamos guardar el mensaje que vaya a salir por pantalla, en una variable de tipo cadena, en lugar de mostrarla directamente. Una vez terminados todos los posibles casos se presentará por pantalla dicha cadena resultado.

Nota: No es necesario que controles valores incoherentes (volumen actual negativo o superior a la capacidad máxima del embalse). En las próximas unidades dispondremos de más herramientas para controlar estas situaciones.

## Ejercicio 5

### Título:
¡Vamos al parque acuático!

### Descripción:
Escribe un programa en Java que permita calcular el importe a pagar por los clientes del Parque Acuático AquaTrass teniendo en cuenta los siguientes requisitos:

existirán dos tipos de entradas:
Infantil con un precio base de 10,00 €
Adulto con un precio base de 15,00 €.
en caso de que el coste total de las entradas sea superior a 50,00 € se aplicará automáticamente un 5% de descuento. Igualmente, si el importe base total es superior a 100,00 € el descuento será de un 15%.
Además, una vez realizados los descuentos pertinentes se deberá aplicar un IVA del 21% al importe resultante.

El programa solicitará la cantidad de entradas de cada tipo que se desean comprar, realizará todos los cálculos necesarios y mostrará por pantalla los siguientes resultados:

el número de entradas de adulto y de entradas infantiles que comprará el cliente.
el importe total de las entradas antes de aplicar (si procede) el descuento.
el porcentaje de descuento que se aplicará o el texto "No procede descuento en esta compra"en caso de que no se cumplan los requisitos para aplicar descuento
el importe total aplicando el descuento (si procede) pero no el IVA.
el importe total de la compra tras aplicar el descuento que corresponda y el IVA indicado anteriormente.
Por último, el sistema mostrará la cantidad final que deberá pagar el cliente la cual será la parte entera del importe total calculado anteriormente (por ejemplo, si el importe total fuera 32,67 € la cantidad final que debería pagar el cliente sería 32 €).

Importante: Debes mostrar las cantidades decimales de forma que muestren únicamente 2 decimales. Para ello, puedes hacer uso del método printf (busca información en internet sobre cómo usarlo). Por ahora no controlaremos que la cantidad de entradas introducidas tenga que ser positiva (aunque una cantidad negativa de entradas en nuestro ejemplo no tendría sentido). Más adelante veremos cómo poder controlar estas cosas.

Recomendación
Puedes obtener la parte entera de un número realizando una operación de casting (los métodos matemáticos de redondeo aún no se han estudiado, por lo que no podrán utilizarse para resolver este problema).

