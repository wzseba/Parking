package parkingUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parking {

	private List<String> matriculas;
	private String nombreParking;

	public Parking(int tamanio, String nombreParking) {
		/*
		 * Crea una lista inmutable con n copias de null y usa esa lista inmutable para
		 * inicializar arraylist mutable
		 */
		this.matriculas = new ArrayList<String>(Collections.nCopies(tamanio, null));
		this.nombreParking = nombreParking;
	}

	public String getNombre() {
		return nombreParking;
	}

	public void entrada(String matricula, int plaza) {

	}
}
