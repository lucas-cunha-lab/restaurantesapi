package academy.devdojo.youtube.course.exception;

public class ObjectNotFoundException extends RuntimeException {

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;

}
