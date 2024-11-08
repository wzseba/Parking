package parkingUno;

import java.util.Scanner;

import excepciones.FueraRangoException;
import excepciones.MatriculaIncorrectaException;
import excepciones.MatriculaNoExisteException;
import excepciones.MatriculaRepException;
import excepciones.PlazaOcuException;

public class Principal {

	public static void main(String[] args) {
		Parking parking = new Parking(10, "park");
		Scanner input = new Scanner(System.in);
		boolean bandera = false;

		while (!bandera) {
			System.out.println("1- Entrada de coche");
			System.out.println("2- Salida de coche");
			System.out.println("3- Mostrar parking");
			System.out.println("4- Salir del parking");
			int opcion = input.nextInt();

			switch (opcion) {
			case 1: {
				System.out.print("Introduzca la matrícula del coche: ");
				String matricula = input.next();
				System.out.print("Introduzca el numero de plaza : ");
				int plaza = input.nextInt();
				System.out.println("----------------------");
				try {

					parking.entrada(matricula, plaza);
					System.out.println("Plazas totales: " + parking.getPlazasTotales());
					System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
					System.out.println("Plazas libres: " + parking.getPlazasLibres());
					System.out.println("----------------------");
				} catch (MatriculaIncorrectaException | PlazaOcuException | MatriculaRepException
						| FueraRangoException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 2: {
				System.out.println("introduzca la matrícula del coche que sale");
				String matricula = input.next();
				System.out.println("----------------------");
				try {
					parking.salida(matricula);
					System.out.println("Plazas totales: " + parking.getPlazasTotales());
					System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
					System.out.println("Plazas libres: " + parking.getPlazasLibres());
					System.out.println("----------------------");
				} catch (MatriculaNoExisteException e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			case 3: {
				System.out.println("----------------------");
				System.out.print(parking.toString());
				System.out.println("----------------------");
				break;
			}
			case 4: {
				bandera = true;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value");
			}
		}
		input.close();
	}

}
