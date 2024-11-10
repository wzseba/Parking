package excepciones;

public class ParkingException extends Exception {

//	private static final long serialVersionUID = 1L;

	private String matri;

	public ParkingException(String msg, String matri) {
		super(msg);
		this.matri = matri;
	}

	public String getMensaje() {
		return super.getMessage();
	}

	public String getMatricula() {
		return matri;
	}
}