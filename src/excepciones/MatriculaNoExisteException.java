package excepciones;

public class MatriculaNoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	public MatriculaNoExisteException(String mensaje) {
		super(mensaje);
	}
}
