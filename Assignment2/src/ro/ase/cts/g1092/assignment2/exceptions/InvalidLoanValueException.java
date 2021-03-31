package ro.ase.cts.g1092.assignment2.exceptions;

public class InvalidLoanValueException extends Exception {

	private String errorMessage;
	private int errorCode;
	
	public InvalidLoanValueException(String errorMessage, int errorCode) {
		this.errorMessage=errorMessage;
		this.errorCode=errorCode;
		System.out.println(errorMessage+", "+errorCode);
	}

}
