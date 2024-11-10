package parkingUno;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.ParkingException;

public class Principal {

	public static void main(String[] args) {
		Parking parking = new Parking(10, "Parking Center");
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("1- Entrada de coche");
			System.out.println("2- Salida de coche");
			System.out.println("3- Mostrar parking");
			System.out.println("4- Salir del parking");

			try {
				int opcion = input.nextInt();
				input.nextLine(); // Limpiar salto de linea

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
					} catch (ParkingException e) {
						System.err.println(e.getMensaje() + "matricula: " + e.getMatricula());
					} catch (Exception e) {
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
					} catch (ParkingException e) {
						System.err.println(e.getMensaje() + "matricula: " + e.getMatricula());
					} catch (Exception e) {
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
					System.out.println("Saliendo del programa...");
					input.close();
					return;
				}
				default:
					System.out.println("valor incorrecto");
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("Entrada no valida, eliga entre 1 - 4");
				input.nextLine(); // Limpiar la entrada incorrecta
			}
		}
	}
}