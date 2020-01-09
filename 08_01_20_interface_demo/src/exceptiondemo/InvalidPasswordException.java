package exceptiondemo;

public class InvalidPasswordException extends Exception {
private String message;

public InvalidPasswordException(String message) {
	super();
	this.message = message;
}

}
