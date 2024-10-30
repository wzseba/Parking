# Parking

**Control de Ocupaci�n de un Parking**

Se pide realizar una aplicaci�n sencilla que permita controlar la ocupaci�n en tiempo real de un Parking.

Para ello, se necesitar� una clase Parking con las caracter�sticas que se indican a continuaci�n.

Todo el control de errores se har� lanzando y capturando Excepciones. 

##Clase Parking

**Atributo matr�culas**

La clase Parking tendr� como atributo un ArrayList de String llamado **matr�culas**. 

Este ArrayList representar� las distintas plazas del parking, y contendr� las matr�culas de los coches aparcados en cada plaza.

Por ejemplo, si el coche con matr�cula 1234-KW aparca en la plaza 23, entonces introduciremos en el ArrayList la cadena �1234-KW� en la posici�n 23 del array.

Si la plaza 45 estuviera libre, entonces la posici�n 45 del array contendr� el valor null.

**Atributo nombre**

Este otro atributo ser� un String y se corresponder� con el nombre del parking.

**Constructor**

El constructor de la clase Parking recibir� el nombre del parking y un entero, indicando el n�mero de plazas del parking, y construir� el ArrayList matr�culas con ese tama�o e inicializando cada posici�n a null.

**M�todos**

**public String getNombre()**

Devuelve el nombre del parking

**public void entrada(String matricula, int plaza)**

Este m�todo introduce el coche con la matricula indicada en la plaza del parking indicada.

**Control de errores:**

- Si la matr�cula tiene un tama�o menor de 4 caracteres o es null, se lanzar� una excepci�n con el mensaje �Matr�cula incorrecta�
- Si la plaza ya estuviera ocupada se lanzar� una excepci�n con el mensaje �Plaza ocupada�
- Si la matr�cula existiera dentro del parking se lanzar� una excepci�n con el mensaje �Matr�cula repetida�

**public int salida(String matricula)**

Este m�todo hace que el coche con la matr�cula indicada salga del parking, liberando la plaza correspondiente. Devolver� el n�mero de la plaza liberada.

**Control de errores:**

- Si la matr�cula no existe dentro del parking se lanzar� una excepci�n con el mensaje �Matr�cula no existente�

**public int getPlazasTotales()**

* Este m�todo devuelve las plazas totales del parking. 

**public int getPlazasOcupadas()**

* Este m�todo devuelve las plazas ocupadas del parking. 

**public int getPlazasLibres()**

* Este m�todo devuelve las plazas libres del parking. 

**public String toString()**

* La sobrecarga de este m�todo devolver� una cadena que contendr� el nombre del parking y un listado de cada plaza y la matr�cula que la ocupa. Por ejemplo:

| Parking Avenida |
| -- |

| Plaza 0: (vac�a) | 
 
| Plaza 1: 3322AB  |
 
| Plaza 2: 5342HW  | 
 
| Plaza 3: (vac�a) |

**Clase principal**

En la clase principal realice un programa de prueba que haga lo siguiente: Crear un objeto Parking:

- Crea un objeto Parking llamado �Parking Centro� con 10 plazas.

Men� de opciones:

- Despu�s de crear el objeto Parking, se mostrar� al usuario un men� con cuatro opciones: 1) Entrada de coche y 2) Salida de coche, 3) Mostrar parking y 4) Salir del programa.
- Se le pedir� al usuario que introduzca un valor entero, entre 1 y 4, correspondiente a una de las opciones (use la clase Scanner y el m�todo nextLine, convirtiendo la entrada a entero)

Opci�n 1. Entrada de coche:

- La opci�n Entrada de coche le pedir� al usuario que introduzca por teclado la matr�cula del coche que entra y la plaza donde se colocar�, y a continuaci�n se introducir� el coche en el parking en dicha plaza. La opci�n mostrar� luego el n�mero de plazas totales, ocupadas y disponibles despu�s de la entrada.
- Para pedir la plaza, use el m�todo nextLine de la clase Scanner y convierta el dato introducido por teclado a entero.
- Se capturar�n las excepciones si las hubiera, y en ese caso se mostrar�a el mensaje de error y la entrada no se llevar�a a cabo.

Opci�n 2. Salida de coche.

- La opci�n Salida de coche le pedir� al usuario que introduzca por teclado la matr�cula del coche que sale y a continuaci�n se mostrar�n las plazas totales, libres y ocupadas del parking despu�s de la salida.
- Se capturar�n las excepciones si las hubiera, y en ese caso se mostrar�a el mensaje de error y la entrada no se llevar�a a cabo.

Opci�n 3. Mostrar parking.

- Esta opci�n muestra todas las plazas y las matr�culas que las ocupan (se usar� el m�todo toString de la clase Parking)

Opci�n 4. Salir del programa

- El programa mostrar� el men� repetidas veces hasta que se pulse esta opci�n.

**Mejoras Finales**

1. La entrada de la opci�n num�rica del men� puede causar una ca�da del programa si el usuario introduce un texto en vez de un entero. Evite esto usando un try�catch en la l�nea donde se pide la opci�n del men� elegida.
1. Es posible crear clases de Excepciones propias. Cree una clase ParkingException que construya una excepci�n con un mensaje y una matr�cula, y contenga un m�todo getMensaje que devuelva el mensaje y otro m�todo getMatricula que devuelva la matr�cula del coche que ha producido el error.

   Nota: esta clase heredar� de la clase Exception

   Una vez realizada esta clase, �sela para lanzar las excepciones de la clase Parking.

   Modifique tambi�n el programa principal de forma que los try� catch de la entrada de coches y la salida sean capaz de capturar excepciones de tipo ParkingException y de otros tipos.