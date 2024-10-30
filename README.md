# Parking

**Control de OcupaciÃ³n de un Parking**

Se pide realizar una aplicaciÃ³n sencilla que permita controlar la ocupaciÃ³n en tiempo real de un Parking.

Para ello, se necesitarÃ¡ una clase Parking con las caracterÃ­sticas que se indican a continuaciÃ³n.

Todo el control de errores se harÃ¡ lanzando y capturando Excepciones. 

## Clase Parking

**Atributo matrÃ­culas**

La clase Parking tendrÃ¡ como atributo un ArrayList de String llamado **matrÃ­culas**. 

Este ArrayList representarÃ¡ las distintas plazas del parking, y contendrÃ¡ las matrÃ­culas de los coches aparcados en cada plaza.

Por ejemplo, si el coche con matrÃ­cula 1234-KW aparca en la plaza 23, entonces introduciremos en el ArrayList la cadena â€œ1234-KWâ€� en la posiciÃ³n 23 del array.

Si la plaza 45 estuviera libre, entonces la posiciÃ³n 45 del array contendrÃ¡ el valor null.

**Atributo nombre**

Este otro atributo serÃ¡ un String y se corresponderÃ¡ con el nombre del parking.

**Constructor**

El constructor de la clase Parking recibirÃ¡ el nombre del parking y un entero, indicando el nÃºmero de plazas del parking, y construirÃ¡ el ArrayList matrÃ­culas con ese tamaÃ±o e inicializando cada posiciÃ³n a null.

**MÃ©todos**

**public String getNombre()**

Devuelve el nombre del parking

**public void entrada(String matricula, int plaza)**

Este mÃ©todo introduce el coche con la matricula indicada en la plaza del parking indicada.

**Control de errores:**

- Si la matrÃ­cula tiene un tamaÃ±o menor de 4 caracteres o es null, se lanzarÃ¡ una excepciÃ³n con el mensaje â€œMatrÃ­cula incorrectaâ€�
- Si la plaza ya estuviera ocupada se lanzarÃ¡ una excepciÃ³n con el mensaje â€œPlaza ocupadaâ€�
- Si la matrÃ­cula existiera dentro del parking se lanzarÃ¡ una excepciÃ³n con el mensaje â€œMatrÃ­cula repetidaâ€�

**public int salida(String matricula)**

Este mÃ©todo hace que el coche con la matrÃ­cula indicada salga del parking, liberando la plaza correspondiente. DevolverÃ¡ el nÃºmero de la plaza liberada.

**Control de errores:**

- Si la matrÃ­cula no existe dentro del parking se lanzarÃ¡ una excepciÃ³n con el mensaje â€œMatrÃ­cula no existenteâ€�

**public int getPlazasTotales()**

* Este mÃ©todo devuelve las plazas totales del parking. 

**public int getPlazasOcupadas()**

* Este mÃ©todo devuelve las plazas ocupadas del parking. 

**public int getPlazasLibres()**

* Este mÃ©todo devuelve las plazas libres del parking. 

**public String toString()**

* La sobrecarga de este mÃ©todo devolverÃ¡ una cadena que contendrÃ¡ el nombre del parking y un listado de cada plaza y la matrÃ­cula que la ocupa. Por ejemplo:

| **Parking Avenida** |
| -- |
| Plaza 0: (vacÃ­a) |
| Plaza 1: 3322AB  |
| Plaza 2: 5342HW  |

**Clase principal**

En la clase principal realice un programa de prueba que haga lo siguiente: Crear un objeto Parking:

- Crea un objeto Parking llamado â€œParking Centroâ€� con 10 plazas.

MenÃº de opciones:

- DespuÃ©s de crear el objeto Parking, se mostrarÃ¡ al usuario un menÃº con cuatro opciones: 1) Entrada de coche y 2) Salida de coche, 3) Mostrar parking y 4) Salir del programa.
- Se le pedirÃ¡ al usuario que introduzca un valor entero, entre 1 y 4, correspondiente a una de las opciones (use la clase Scanner y el mÃ©todo nextLine, convirtiendo la entrada a entero)

OpciÃ³n 1. Entrada de coche:

- La opciÃ³n Entrada de coche le pedirÃ¡ al usuario que introduzca por teclado la matrÃ­cula del coche que entra y la plaza donde se colocarÃ¡, y a continuaciÃ³n se introducirÃ¡ el coche en el parking en dicha plaza. La opciÃ³n mostrarÃ¡ luego el nÃºmero de plazas totales, ocupadas y disponibles despuÃ©s de la entrada.
- Para pedir la plaza, use el mÃ©todo nextLine de la clase Scanner y convierta el dato introducido por teclado a entero.
- Se capturarÃ¡n las excepciones si las hubiera, y en ese caso se mostrarÃ­a el mensaje de error y la entrada no se llevarÃ­a a cabo.

OpciÃ³n 2. Salida de coche.

- La opciÃ³n Salida de coche le pedirÃ¡ al usuario que introduzca por teclado la matrÃ­cula del coche que sale y a continuaciÃ³n se mostrarÃ¡n las plazas totales, libres y ocupadas del parking despuÃ©s de la salida.
- Se capturarÃ¡n las excepciones si las hubiera, y en ese caso se mostrarÃ­a el mensaje de error y la entrada no se llevarÃ­a a cabo.

OpciÃ³n 3. Mostrar parking.

- Esta opciÃ³n muestra todas las plazas y las matrÃ­culas que las ocupan (se usarÃ¡ el mÃ©todo toString de la clase Parking)

OpciÃ³n 4. Salir del programa

- El programa mostrarÃ¡ el menÃº repetidas veces hasta que se pulse esta opciÃ³n.

**Mejoras Finales**

1. La entrada de la opciÃ³n numÃ©rica del menÃº puede causar una caÃ­da del programa si el usuario introduce un texto en vez de un entero. Evite esto usando un tryâ€¦catch en la lÃ­nea donde se pide la opciÃ³n del menÃº elegida.
1. Es posible crear clases de Excepciones propias. Cree una clase ParkingException que construya una excepciÃ³n con un mensaje y una matrÃ­cula, y contenga un mÃ©todo getMensaje que devuelva el mensaje y otro mÃ©todo getMatricula que devuelva la matrÃ­cula del coche que ha producido el error.

   Nota: esta clase heredarÃ¡ de la clase Exception

   Una vez realizada esta clase, Ãºsela para lanzar las excepciones de la clase Parking.

   Modifique tambiÃ©n el programa principal de forma que los tryâ€¦ catch de la entrada de coches y la salida sean capaz de capturar excepciones de tipo ParkingException y de otros tipos.
