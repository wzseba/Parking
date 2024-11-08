package parkingUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import excepciones.FueraRangoException;
import excepciones.MatriculaIncorrectaException;
import excepciones.MatriculaNoExisteException;
import excepciones.MatriculaRepException;
import excepciones.PlazaOcuException;

public class Parking {

	private List<String> matriculas;
	private String nombreParking;
	private int plazasOcupadas;

	public Parking(int tamanio, String nombreParking) {
		/*
		 * Crea una lista inmutable con n copias de null y usa esa lista inmutable para
		 * inicializar arraylist mutable
		 */
		// inicializando la capacidad interna
		this.matriculas = new ArrayList<String>(Collections.nCopies(tamanio, null));
		this.nombreParking = nombreParking;
		this.plazasOcupadas = 0;
	}

	public String getNombre() {
		return nombreParking.toUpperCase();
	}

	public void setPlazasOcupadas(int po) {
		this.plazasOcupadas = po;
	}

	public void entrada(String matricula, int plaza)
			throws MatriculaIncorrectaException, PlazaOcuException, MatriculaRepException, FueraRangoException {
		// Verifica si un objeto es null antes de usarlo

		if (matricula == null || matricula.length() < 4) {
			throw new MatriculaIncorrectaException("Matricula incorrecta");
		}
		if (plaza < 0 || plaza >= matriculas.size()) {
			throw new FueraRangoException("fuera de rango");
		}
		if (matriculas.get(plaza) != null) {
			throw new PlazaOcuException("Plaza ocupada");
		}
		if (matriculas.contains(matricula)) {
			throw new MatriculaRepException("Matricula repetida");
		}
		matriculas.add(plaza, matricula);
		setPlazasOcupadas(getPlazasOcupadas() + 1);
	}

	public int salida(String matricula) throws MatriculaNoExisteException {
		if (!matriculas.contains(matricula)) {
			throw new MatriculaNoExisteException("Matricula no existe");
		}

		int plaza = matriculas.indexOf(matricula);
		matriculas.set(plaza, null);
		setPlazasOcupadas(getPlazasOcupadas() - 1);
		return plaza;
	}

	public int getPlazasTotales() {
		return matriculas.size();
	}

	public int getPlazasOcupadas() {
		/*
		 * Tambien se podria usar foreach pero tendria menor rendimiento si la lista
		 * llega a ser grande y el metodo es usado con frecuencia. El enfoque actual se
		 * necesita que se menatenga sincronizado en todos los metodos que sea
		 * necesario, tiene mejor rendimiento pero se debe ser cuidar el estado del
		 * atributo plazasOcupadas actualizando en todos los lugares que sea necesario.
		 */
		return plazasOcupadas;
	}

	public int getPlazasLibres() {
		return getPlazasTotales() - getPlazasOcupadas();
	}

	@Override
	public String toString() {
		String park = "";
		park = "\t" + getNombre() + "\n----------------------\n";
		for (int i = 0; i < matriculas.size(); i++) {
			if (matriculas.get(i) == null) {
				park += "Plaza " + i + " : (vacia)\n";
			} else {
				park += "Plaza " + i + " : " + matriculas.get(i);
			}
		}
		return park;
	}

}
