package parkingUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import excepciones.MatriculaIncorrectaException;
import excepciones.MatriculaRepException;
import excepciones.PlazaOcuException;

public class Parking {

	private List<String> matriculas;
	private String nombreParking;

	public Parking(int tamanio, String nombreParking) {
		/*
		 * Crea una lista inmutable con n copias de null y usa esa lista inmutable para
		 * inicializar arraylist mutable
		 */
		// inicializando la capacidad interna
		this.matriculas = new ArrayList<String>(Collections.nCopies(tamanio, null));
		this.nombreParking = nombreParking;
	}

	public String getNombre() {
		return nombreParking;
	}

	public void entrada(String matricula, int plaza)
			throws MatriculaIncorrectaException, PlazaOcuException, MatriculaRepException {
		// Verifica si un objeto es null antes de usarlo
		if (matricula == null || matricula.length() < 4) {
			throw new MatriculaIncorrectaException("Matricula incorrecta");
		}
		if (matriculas.get(plaza) != null) {
			throw new PlazaOcuException("Plaza ocupada");
		}
		if (matriculas.contains(matricula)) {
			throw new MatriculaRepException("Matricula repetida");
		}
		matriculas.add(plaza, matricula);
	}
}
