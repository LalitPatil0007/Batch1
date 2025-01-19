package exceptionhandling;

public class UnAuthorisedUser extends Exception{

	public UnAuthorisedUser(String msg) {
		super(msg);
	}
}
