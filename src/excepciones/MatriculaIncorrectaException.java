package excepciones;

public class MatriculaIncorrectaException extends Exception {

	private static final long serialVersionUID = 1L;

	public MatriculaIncorrectaException(String mensaje) {
		super(mensaje);
	}
}
