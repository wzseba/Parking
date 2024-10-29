package parkingUno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parking {

	private List<String> matriculas;
	private String nombreParking;

	public Parking(int tamanio, String nombreParking) {
		this.matriculas = new ArrayList<String>(Collections.nCopies(tamanio, null));
		this.nombreParking = nombreParking;
	}

}
